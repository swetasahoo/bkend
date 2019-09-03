package com.niit.Backend;

import org.hibernate.SessionFactory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.ProductDao;
import com.niit.dao.ProductDaoImpl;
import com.niit.dao.UserDao;
import com.niit.model.Product;
import com.niit.model.User;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.niit");
	context.refresh();
	
	ProductDao productDao=(ProductDao) context.getBean("productDao");
	
	Product product=(Product) context.getBean("product");
	
	//product.setId(16);
	product.setName("jeanhjtrjyuks");
	product.setPrice("2000");
	product.setDescription("stretchable");
	product.setEnabled(true);
	
	
	productDao.saveOrUpdate(product);
	System.out.println("data stored");
	}

	
}
