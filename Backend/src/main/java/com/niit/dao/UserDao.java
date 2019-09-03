package com.niit.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niit.model.User;


public interface UserDao {
	  public List<User> list();
		
		public User get(String userid, String password);
		
		public void saveorupdate(User user);
		
		public void delete(String userid);

		

}
