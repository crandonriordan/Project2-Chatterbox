package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.dao.UserDaoImpl;
import com.revature.models.User;
import com.revature.services.UserService;

@CrossOrigin
@RestController
public class UserController {
	
	@Autowired
	UserService userService;

	UserDaoImpl udi = new UserDaoImpl();
	
	@GetMapping(value="/api/users")
	public List<User> getAllUsers() {
		return userService.getUsers();
	}
	
	@GetMapping(value="/api/users/{id}")
	public User getUserById(@PathVariable("id") String id) {
		return userService.findUserById(id);
	}
	
	@PostMapping(value="/api/users", consumes = "application/json", produces = "application/json")
	public User addUser(@RequestBody User user) {
		User userById = udi.getUserById(user.getId());
		if(userById == null) {
			return userService.createUser(user);
		} else {
			return null;
		}
		
	}
	
	@DeleteMapping(value="/api/users/{id}", produces="application/json")
	public User deleteUser(@RequestBody User user) {
		userService.deleteUser(user);
		return user;
	}
	
	@RequestMapping(method= {RequestMethod.OPTIONS, RequestMethod.HEAD, RequestMethod.TRACE, RequestMethod.PATCH})
	public String unSupportedRequest() {
		return "not supported requests";
	}
	
	
}
