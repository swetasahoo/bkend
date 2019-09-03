package com.niit.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Category;
import com.niit.model.Seller;

	@Repository("sellerDao")
	@Transactional
	@Component
	public class SellerDaoImpl implements SellerDao {

		@Autowired
		 SessionFactory sessionFactory;
		
		
		public SellerDaoImpl(SessionFactory sessionFactory)
		{
			this.sessionFactory=sessionFactory;
		}

		
		@Transactional
		public void saveorupdate(Seller s) {
			s.setEnabled(true);
			sessionFactory.getCurrentSession().saveOrUpdate(s);
			return;
		}

		@Transactional
		public List<Seller> getAllSellers() {
			Session s = sessionFactory.getCurrentSession();
			TypedQuery<Seller> query = s.createQuery("from Seller where enabled = true", Seller.class);
	        
	        return query.getResultList();
		}

		@Transactional
		public Seller getSeller(int Sellerid) {
			Session s = sessionFactory.getCurrentSession();
			TypedQuery<Seller> query = s.createQuery("from Seller where Sellerid = :Sellerid", Seller.class);
	        query.setParameter("Sellerid", Sellerid);
			
	        List<Seller> l = query.getResultList();
	        
	        if (l == null || l.size() == 0) {
	        	return null;
	        }
	        
	        return l.get(0);
		}

		@Transactional
		public void delete(int Sellerid) {
			Session sess = sessionFactory.getCurrentSession();
			Seller s = getSeller(Sellerid);
			s.setEnabled(false);
			sess.saveOrUpdate(s);
		}
		
		

		


		

	}

	
	
	
