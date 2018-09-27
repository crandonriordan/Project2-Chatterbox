package com.revature.daotest;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.revature.dao.UserDao;
import com.revature.dao.UserDaoImpl;

public class UserDaoTest {
	static final Logger logger = Logger.getLogger(CommentDaoTest.class);
	
	UserDao udi = new UserDaoImpl();

	@Test
	public void createUser() {
		// udi.createUser(user);
		// assert
	}
	
	@Test
	public void deleteUser() {
		// udi.deleteUser(user);
		// assert
	}
	
	@Test
	public void getUserById() {
		// udi.getUserById(id);
		// assert
	}
	
	@Test
	public void getUsers() {
		// udi.getUsers();
		// assert
	}
}
