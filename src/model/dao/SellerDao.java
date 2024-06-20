package model.dao;

import java.util.List;

public interface SellerDao {

public void insert(SellerDao obj);
	
	public void update(SellerDao obj);
	
	public void deleteById(Integer id);
	
	public SellerDao findById(Integer id);
	
	public List<SellerDao> findAll();
}
