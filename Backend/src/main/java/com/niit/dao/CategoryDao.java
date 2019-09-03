package com.niit.dao;

import java.util.List;

import com.niit.model.Category;


public interface CategoryDao {

void saveOrUpdate(Category category);
	
	List<Category> getAllCategories();
	
	Category getCategory(int id);
	
	public void delete(int id);

}
