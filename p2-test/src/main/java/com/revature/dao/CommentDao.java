package com.revature.dao;

import java.util.List;

import com.revature.models.Comment;

public interface CommentDao {
	List<Comment> getComments();
	Comment getCommentByUserId(String id);
	int createComment(Comment comment);
}
