package com.niit.Backend;


import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.SellerDao;
import com.niit.dao.SellerDaoImpl;
import com.niit.dao.UserDao;
import com.niit.model.Seller;
import com.niit.model.User;


public class SellerTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.niit");
	context.refresh();
	
	SellerDao sellerDao=(SellerDao) context.getBean("sellerDao");
	
	Seller seller=(Seller) context.getBean("seller");
	
	
	
	seller.setName("Big Bazar");
	seller.setAddress("kolkata");
	seller.setEnabled(true);
	
	
	
	
	sellerDao.saveorupdate(seller);
	System.out.println("data stored");
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

