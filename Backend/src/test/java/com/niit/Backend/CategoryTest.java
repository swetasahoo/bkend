package com.niit.Backend;

import org.hibernate.SessionFactory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.CategoryDao;
import com.niit.dao.CategoryDaoImpl;
import com.niit.dao.UserDao;
import com.niit.model.Category;
import com.niit.model.User;

public class CategoryTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.niit");
	context.refresh();
	
	CategoryDao categoryDao=(CategoryDao) context.getBean("categoryDao");
	
	Category category=(Category) context.getBean("category");
	
	
	category.setDescription("slimdfhdh");
	category.setEnabled(true);
	category.setName("integrity jeans");
	
	
	
	categoryDao.saveOrUpdate(category);
	System.out.println("data stored");
	}


}
