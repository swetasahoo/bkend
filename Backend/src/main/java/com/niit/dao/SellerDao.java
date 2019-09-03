package com.niit.dao;

import java.util.List;

import com.niit.model.Seller;
import com.niit.model.User;

	public interface SellerDao {
	
		public void saveorupdate(Seller s);
		
		List<Seller> getAllSellers();
		
		Seller getSeller(int Sellerid);
		
		 void delete(int Sellerid);
		
	}



