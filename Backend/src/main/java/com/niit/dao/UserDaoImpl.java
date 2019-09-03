package com.niit.dao;

import java.util.List;


import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.User;

@Repository("userDao")
@Transactional
@Component
public class UserDaoImpl implements UserDao {
	@Autowired
	SessionFactory sessionFactory;
	
	public UserDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}

	@Transactional
	public List<User> list() {
		@SuppressWarnings("unchecked")
		List<User> listUser=sessionFactory.getCurrentSession().createCriteria(User.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listUser;
	}

	@Transactional
	public User get(String username,String password) {
		
		return null;
	}

	@Transactional
	public void saveorupdate(User user) {
		user.setRole("ROLE_USER");
		user.setEnabled(true);
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}

	@Transactional
	public void delete(String userid) {
		User userToDelete = new User();
		userToDelete.setUserid(userid);
		sessionFactory.getCurrentSession().delete(userToDelete);
	}

	


	
}
