package com.niit.dao;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.model.Seller;


@Repository("productDao")
@Transactional
@Component
public class ProductDaoImpl implements ProductDao {

	// directory for storing images
		private static final String IMAGEFOLDER = 
				"F:\\project\\workspace\\ecom\\src\\main\\webapp\\resources\\images\\";
		
		@Autowired
		 SessionFactory sessionFactory;
		
		public ProductDaoImpl(SessionFactory sessionFactory)
		{
			this.sessionFactory=sessionFactory;
		}
		
		
		public void saveOrUpdate(Product p) {
			Product p1 = getProduct(p.getId());
			
			if (p1 == null) {
				save(p);
				storeImage(p); // after save, p has some id != 0
			}
			else {
				update(p);
			}
			
		}

		


		


		private void storeImage(Product p) {
			// TODO Auto-generated method stub
			
		}


		private void save(Product p) {
			Seller s;
			Category c;
			
			p.setEnabled(true);
			sessionFactory.getCurrentSession().saveOrUpdate(p);
		}
		
		private void update(Product p) {
			Product p1 = getProduct(p.getId());
			
			
			p1.setName(p.getName());
			p1.setDescription(p.getDescription());
			p1.setPrice(p.getPrice());
			
			sessionFactory.getCurrentSession().saveOrUpdate(p1);
		}
		
	
		public List<Product> getAllProducts() {
			Session s = sessionFactory.getCurrentSession();
			TypedQuery<Product> query = s.createQuery("from Product where enabled = true", Product.class);
	        
	        return query.getResultList();
		}

		
		public Product getProduct(int id) {
			Session s = sessionFactory.getCurrentSession();
			TypedQuery<Product> query = s.createQuery("from Product where id = :id", Product.class);
			query.setParameter("id", id);
	        
	        List<Product> l = query.getResultList();
	        
	        if (l == null || l.size() == 0) {
	        	return null;
	        }
	        
	        return l.get(0);
		}

	
		public void delete(int id) {
			try {
				System.out.println("\nProductDAOImpl delete()");
				
				Product p = getProduct(id);
				p.setEnabled(false);
				
				sessionFactory.getCurrentSession().saveOrUpdate(p);
			} 
			catch (Exception e) {
				System.out.println("ProductDAOIMPL delete()");
				e.printStackTrace();
			}
		}


		public List<Product> getAllProductsByCategory(int categoryId) {
			// TODO Auto-generated method stub
			return null;
		}


		public List<Product> getAllProductsBySeller(int sellerId) {
			// TODO Auto-generated method stub
			return null;
		}


	}

	
	
	
	
	

