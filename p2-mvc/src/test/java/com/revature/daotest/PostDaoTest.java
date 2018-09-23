package com.revature.daotest;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import com.revature.dao.PostDaoImpl;
import com.revature.models.Post;

public class PostDaoTest {
	static final Logger logger = Logger.getLogger(CommentDaoTest.class);
	
	PostDaoImpl pdi = new PostDaoImpl();
	
	@Test
	public void getPostById(int id) {
		// pdi.getPostById(id);
		// assert
	}
	
	@Test
	public void getPosts() {
		// pdi.getPosts();
		// assert
	}
	
	@Test
	public void getPostsByPage(int page) {
		// pdi.getPostsByPage(page);
		// assert
	}
	
	@Test
	public void getPostsByUserId(String id) {
		// pdi.getPostsByUserId(id);
		// assert
	}
	
	@Test
	public void getPostsByGroupId(int id) {
		// pdi.getPostsByGroupId(id);
		// assert
	}
	
	@Test
	public void getPostsByGroupName(String name) {
		// pdi.getPostsByGroupName(name);
		// assert
	}
	
	@Test
	public void createPost(Post post) {
		// pdi.createPost(post);
		// assert
	}
	
	@Test
	public void deletePost(Post post) {
		// pdi.deletePost(post);
		// assert
	}
}
