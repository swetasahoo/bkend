package com.niit.dao;

import java.util.List;

import com.niit.model.Product;

public interface ProductDao {

void saveOrUpdate(Product p);
	
	List<Product> getAllProducts();
	
	List<Product> getAllProductsByCategory(int categoryId);
	
	List<Product> getAllProductsBySeller(int sellerId);
	
	Product getProduct(int id);
	
	void delete(int id);


}
