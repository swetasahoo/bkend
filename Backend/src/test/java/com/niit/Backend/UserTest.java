package com.niit.Backend;

import org.hibernate.SessionFactory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.UserDao;
import com.niit.dao.UserDaoImpl;
import com.niit.model.User;

public class UserTest {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.niit");
	context.refresh();
	
	UserDao userDao=(UserDao) context.getBean("userDao");
	
	User user=(User) context.getBean("user");
	
	user.setUserid("amir073");
	user.setName("Aamir");
	user.setAddress("kolkata");
	user.setEmail("amir@gmail.com");
	user.setEnabled(true);
	user.setPhoneNumber("7890678985");
	user.setPassword("password");
	
	
	
	userDao.saveorupdate(user);
	System.out.println("data stored");
	}

}
