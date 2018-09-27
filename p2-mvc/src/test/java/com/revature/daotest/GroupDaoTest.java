package com.revature.daotest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.revature.dao.GroupDaoImpl;
import com.revature.models.Group;


public class GroupDaoTest {
	static final Logger logger = Logger.getLogger(CommentDaoTest.class);
	GroupDaoImpl gdi = new GroupDaoImpl();
	
	@Test 
	public void getGroups() {
		List<Group> groups = new ArrayList<>();
		assertEquals(groups.getClass(), gdi.getGroups().getClass());
	}
	
	@Test
	public void getGroupById() {
		assertEquals(new Group().getClass(), gdi.getGroupById(125).getClass());
	}
	
	@Test
	public void getGroupByIdThatDoesNotExist() {
		assertNull(gdi.getGroupById(-1));
	}
	
	@Test
	public void getGroupByName() {
		assertEquals(new Group().getClass(), gdi.getGroupByName("TheOfficeFanFiction").getClass());
	}
	
	@Test
	public void getGroupByNameThatDoesNotExist() {
		assertNull(gdi.getGroupByName("gardening"));
	}
	
	@Test
	public void createGroup() {
		Group g = new Group("TestGroup");
		gdi.createGroup(g);
		String result = gdi.getGroupByName("TestGroup").getName().toLowerCase();
		assertEquals("testgroup", result);
		gdi.deleteGroup(g);
	}
	
}
