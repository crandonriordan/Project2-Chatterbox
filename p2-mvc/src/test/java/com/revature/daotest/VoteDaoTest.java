package com.revature.daotest;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.revature.dao.VoteDaoImpl;

public class VoteDaoTest {
	static final Logger logger = Logger.getLogger(CommentDaoTest.class);
	
	VoteDaoImpl vdi = new VoteDaoImpl();
	
	@Test
	public void getVotes() {
		assertEquals(9, vdi.getVotes().size());
	}
	
	@Test
	public void getVoteById() {
		// vdi.getVoteById(id);
		// assert
	}
	
	@Test
	public void getVotesByUserId() {
		// assertEquals(1, vdi.getVotesByUserId("ggl-135").size());
	}
	
	@Test
	public void createVote() {
		// vdi.createVote(vote);
		// assert
	}
}
