package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.revature.models.Post;
import com.revature.services.PostService;

@Controller
public class PostController {
	
	@Autowired
	PostService postService;
	
	@GetMapping(value="/api/posts")
	@ResponseBody
	public List<Post> getAllPosts() {
		return postService.findAllPosts();
	}
	
	@GetMapping(value="/api/posts/{name}")
	@ResponseBody
	public List<Post> getAllPostsByGroupName(@PathVariable("name") String name) {
		return postService.findPostsByGroupName(name);
	}
	
	
	
}
