package com.revature.dao;

import java.util.List;

import com.revature.models.Vote;
import com.revature.models.VoteId;

public interface VoteDao {
	List<Vote> getVotes();
	Vote getVoteById(int id);
	List<Vote> getVotesByUserId(String id);
	VoteId createVote(Vote vote);
}
