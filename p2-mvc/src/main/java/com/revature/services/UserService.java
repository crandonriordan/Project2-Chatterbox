package com.revature.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.dao.UserDao;
import com.revature.dao.UserDaoImpl;
import com.revature.models.User;

@Service
public class UserService {
	private UserDao ud = new UserDaoImpl();
	
	public UserService() {
		super();
	}
	
	public User findUserById(String id) {
		return ud.getUserById(id);
	}
	
	public User createUser(User user) {
		ud.createUser(user);
		return user;
	}
	
	public User deleteUser(User user) {
		ud.deleteUser(user);
		return user;
	}
	
	public List<User> getUsers() {
		return ud.getUsers();
	}
}
