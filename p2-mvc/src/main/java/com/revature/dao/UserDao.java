package com.revature.dao;

import com.revature.models.Group;
import com.revature.models.User;

public interface UserDao {
	User getUserById(String id);
	String createUser(User user);
	User updateUser(User user);
}
