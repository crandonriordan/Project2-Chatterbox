package com.revature.dao;

import java.util.List;

import org.hibernate.*;

import com.revature.models.Group;
import com.revature.models.Post;
import com.revature.models.User;
import com.revature.util.HibernateUtil;

public class UserDaoImpl implements UserDao {

	
	// Retrieving user by Auth0 token
	@Override
	public User getUserById(String id) {
		Session s = HibernateUtil.getSession();
		User user = (User) s.get(User.class, id);
		s.close();
		return user;
		
	}

	// User creation.
	@Override
	public String createUser(User user) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		String userPK = (String) s.save(user);
		tx.commit();
		s.close();
		return userPK;
	}

	public User updateUser(User user) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		s.update(user);
		tx.commit();
		s.close();
		return user;
	}

	public void deleteUser(User user) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		s.delete(user);
		tx.commit();
		s.close();
	}

	@Override
	public List<User> getUsers() {
		Session s = HibernateUtil.getSession();
		Query q = s.createQuery("from User");
		List<User> users = q.list();
		s.close();
		return users;
	}
}
