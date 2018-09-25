package com.revature.daotest;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.revature.dao.GroupDaoImpl;
import com.revature.models.Group;


public class GroupDaoTest {
	static final Logger logger = Logger.getLogger(CommentDaoTest.class);
	GroupDaoImpl gdi = new GroupDaoImpl();
	
	@Test 
	public void getGroups() {
		assertEquals(8, gdi.getGroups().size());
	}
	
	@Test
	public void getGroupById() {
		String expected = "knitting";
		String actual = gdi.getGroupById(4).getName().toLowerCase();
		assertEquals(actual, expected);
	}
	
	@Test
	public void getGroupByIdThatDoesNotExist() {
		assertNull(gdi.getGroupById(-1));
	}
	
	@Test
	public void getGroupByName() {
		String expectedName = "basketball";
		String actualName = gdi.getGroupByName("Basketball").getName().toLowerCase();
		assertEquals(actualName, expectedName);
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
	}
	
	// TODO: Test that attempts to create a group that already exists
	
	/*
	@Test
	public void deleteGroup() {
		int sizeBefore = gdi.getGroups().size();
		gdi.deleteGroup(new Group("TestGroup"));
		int sizeAfter = gdi.getGroups().size();
		assertEquals(sizeBefore-1, sizeAfter);
	}
	*/
	
	// TODO: Test that attempts to delete a group that does not exist
}
