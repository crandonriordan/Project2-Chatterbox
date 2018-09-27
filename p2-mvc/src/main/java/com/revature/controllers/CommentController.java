package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Comment;
import com.revature.models.Post;
import com.revature.services.CommentService;

@RestController
@RequestMapping(value="/api/groups/{name}/posts/{id}/comments")
public class CommentController {
	
	@Autowired
	CommentService commentService;
	
	@GetMapping()
	public List<Comment> listAllCommentsByPost(@PathVariable("name") String name, @PathVariable("id") Integer id) {
		return commentService.findAllCommentsByPostId(id);
	}
	
	@PostMapping()
	public Comment createCommentWithPost(@PathVariable("name") String name, 
			@PathVariable("id") Integer id,
			@RequestBody Comment comment) {
		Post post = new Post();
		post.setId(id);
		comment.setPost(post);
		return commentService.creatComment(comment);
	}
	
	@DeleteMapping(value="/{id}")
	public Comment deleteCommentWithPost(@PathVariable("name") String name, 
			@PathVariable("id") Integer id,
			@RequestBody Comment comment) {
		comment.setId(id);
		commentService.deleteComment(comment);
		return comment;
	}
	
	@RequestMapping(method= {RequestMethod.OPTIONS, RequestMethod.HEAD, RequestMethod.TRACE, RequestMethod.PATCH})
	public String unSupportedRequest() {
		return "not supported requests";
	}
	
	
}
