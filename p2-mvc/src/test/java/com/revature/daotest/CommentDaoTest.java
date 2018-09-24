package com.revature.daotest;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import com.revature.dao.CommentDaoImpl;
import com.revature.models.Comment;

public class CommentDaoTest {
	static final Logger logger = Logger.getLogger(CommentDaoTest.class);
	CommentDaoImpl cdi = new CommentDaoImpl();
	
	@Test 
	public void getComments() {
		// cdi.getComments();
		// assert
	}
	
	@Test
	public void getCommentsByUserId() {
		// cdi.getCommentsByUserId();
		// assert PASS: put in a user id that exists
		// assert FAIL: put in a user id that does not exist
	}
	
	@Test
	public void getCommentById(int id) {
		// cdi.getCommentById(id)
		// assert PASS: put in a comment id that exists
		// assert FAIL: put in a comment id that does not exist
	}
	
	@Test
	public void createComment(Comment comment) {
		// cdi.createComment(comment);
		// assert PASS: create a comment
		// assert SOMETHING?: attempt to put in a comment that doesn't have all fields
	}
}