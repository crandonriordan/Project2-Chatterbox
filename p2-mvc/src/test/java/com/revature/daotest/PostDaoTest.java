package com.revature.daotest;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.revature.dao.PostDaoImpl;

public class PostDaoTest {
	static final Logger logger = Logger.getLogger(CommentDaoTest.class);
	
	PostDaoImpl pdi = new PostDaoImpl();
	
	@Test
	public void getPostById() {
		String expected = "Go Browns!";
		String actual = pdi.getPostById(1).getTitle();
		assertEquals(actual, expected);
	}
	
	@Test
	public void getPosts() {
		assertEquals(3, pdi.getPosts().size());
	}
	
	@Test
	public void getPostsByPage() {
		// pdi.getPostsByPage(page);
		// assert
	}
	
	@Test
	public void getPostsByUserId() {
		// pdi.getPostsByUserId(id);
		// assert
	}
	
	@Test
	public void getPostsByGroupId() {
		// pdi.getPostsByGroupId(id);
		// assert
	}
	
	@Test
	public void getPostsByGroupName() {
		assertNotNull(pdi.getPostsByGroupName("Go Browns!"));
	}
	
	@Test
	public void createPost() {
		// pdi.createPost(post);
		// assert
	}
	
	@Test
	public void deletePost() {
		// pdi.deletePost(post);
		// assert
	}
}
