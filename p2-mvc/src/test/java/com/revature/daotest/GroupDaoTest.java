package com.revature.daotest;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import com.revature.dao.GroupDaoImpl;
import com.revature.models.Group;


public class GroupDaoTest {
	static final Logger logger = Logger.getLogger(CommentDaoTest.class);
	GroupDaoImpl gdi = new GroupDaoImpl();
	
	@Test 
	public void getGroups() {
		// gdi.getGroups();
		// assert
	}
	
	@Test
	public void getGroupById(int id) {
		// gdi.getGroupById(id);
		// assert
	}
	
	@Test
	public void getGroupByName(String name) {
		// gdi.getGroupByName(name);
		// assert
	}
	
	@Test
	public void createGroup(Group group) {
		// gdi.createGroup(group);
		// assert
	}
}
