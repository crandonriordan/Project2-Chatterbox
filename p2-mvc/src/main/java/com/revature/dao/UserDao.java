package com.revature.dao;

import com.revature.models.Group;
import java.util.List;

import com.revature.models.User;

public interface UserDao {
	String createUser(User user);
	User updateUser(User user);
	void deleteUser(User user);
	User getUserById(String id);
	List<User> getUsers();
}
