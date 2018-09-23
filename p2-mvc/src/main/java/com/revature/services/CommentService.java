package com.revature.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.dao.CommentDao;
import com.revature.dao.CommentDaoImpl;
import com.revature.models.Comment;

@Service
public class CommentService {

	private CommentDao cd = new CommentDaoImpl();
	
	public CommentService() {
		super();
	}
	
	public Comment creatComment(Comment comment) {
		cd.createComment(comment);
		return comment;
	}
	
	public List<Comment> findAllCommentsByPostId(int id) {
		return cd.getCommentsByPostId(id);
	}
	
	public Comment deleteComment(Comment comment) {
		cd.deleteComment(comment);
		return comment;
	}
	
}
