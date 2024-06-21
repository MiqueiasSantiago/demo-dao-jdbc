package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n=== TEST 7: department insert ===");
		Department newDepartment = new Department(null, "D3");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("=== TEST 8: department findById ===");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		System.out.println("\n=== TEST 9: department update ===");
		department = departmentDao.findById(2);
		department.setName("D4");
		departmentDao.update(department);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 10: department findAll ===");
		List<Department> list1 = new ArrayList<>();
		list1 = departmentDao.findAll();
		for (Department obj : list1) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 11: department delete ===");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
	}

}
