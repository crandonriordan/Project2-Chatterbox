package com.revature.models;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table
public class Role {
	// Role table to manage what users have access to what
	
	
	private int userId;
	
	private String role;
	
}
