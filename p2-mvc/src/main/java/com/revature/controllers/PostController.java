package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.revature.models.Post;
import com.revature.services.PostService;

@CrossOrigin
@RestController
public class PostController {
	
	@Autowired
	PostService postService;
	
	@GetMapping(value="/api/posts")
	public List<Post> getAllPosts() {
		return postService.findAllPosts();
	}
	
	@GetMapping(value="/api/posts/{name}")
	public List<Post> getAllPostsByGroupName(@PathVariable("name") String name) {
		return postService.findPostsByGroupName(name);
	}
	
//	
//	START OF THE NEW NAMING CONVENTION
	
	@GetMapping("/api/groups/{name}/posts")
	public List<Post> getPostsByGroup(@PathVariable("name") String name) {
		return postService.findPostsByGroupName(name);
	}
	
	@GetMapping("/api/groups/{name}/posts/{id}")
	public Post getPostById(@PathVariable("name") String name, @PathVariable("id") Integer id) {
		return postService.findPostById(id);
	}
	
	@PostMapping("/api/groups/{name}/posts")
	public Post getPostById(@PathVariable("name") String name, @RequestBody Post post) {
		return postService.createPost(post);
	}
	
	@PutMapping("/api/groups/{name}/posts/{id}")
	public Post getPostById(@PathVariable("name") String name, 
			@PathVariable("id") Integer id,
			@RequestBody Post post) {
		post.setId(id);
		postService.updatePost(post);
		return post;
	}
	
	@DeleteMapping("/api/groups/{name}/posts/{id}")
	public Post removePost(@PathVariable("name") String name, 
			@PathVariable("id") Integer id,
			@RequestBody Post post) {
		post.setId(id);
		postService.deletePost(post);
		return post;
	}
	
//	
//	END OF NEW NAMING CONVENTION
	
	@PostMapping(value="/api/posts/{name}", consumes = "application/json", produces = "application/json")
	public Post addPost(@RequestBody Post post) {
		return postService.createPost(post);
	}
	
	@PutMapping(value="/api/posts/{name}")
	public String updatePost(@PathVariable("name") String name) {
		return "Not supported";
	}
	
	@DeleteMapping(value="/api/posts/{name}", produces="application/json")
	public Post deletePost(@RequestBody Post post) {
		postService.deletePost(post);
		return post;		
	}
	
	@RequestMapping(value="/api/posts/{name}", method={RequestMethod.HEAD, RequestMethod.OPTIONS, 
			RequestMethod.PATCH, RequestMethod.TRACE})
	public String notSupported() {
		return "not supported";
	}
	
	
	
	
}
