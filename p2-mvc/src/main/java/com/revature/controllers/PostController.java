package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.dao.GroupDao;
import com.revature.dao.GroupDaoImpl;
import com.revature.models.Group;
import com.revature.models.Post;
import com.revature.services.PostService;

@CrossOrigin
@RestController
public class PostController {
	
	@Autowired
	PostService postService;
	
	@GetMapping("/api/groups/{name}/posts")
	public List<Post> getPostsByGroup(@PathVariable("name") String name) {
		return postService.findPostsByGroupName(name);
	}
	
	@GetMapping("/api/groups/{name}/posts/{id}")
	public Post getPostById(@PathVariable("name") String name, @PathVariable("id") Integer id) {
		return postService.findPostById(id);
	}
	
	@PostMapping("/api/groups/{name}/posts")
	public Post postAPost(@PathVariable("name") String name, @RequestBody Post post) {
		System.out.println(post.getUser());
		Group group = new Group();
		GroupDao gd = new GroupDaoImpl();
		group = gd.getGroupByName(name);
		post.setGroup(group);
		return postService.createPost(post);
	}
	
	@PutMapping("/api/groups/{name}/posts/{id}")
	public Post editAPost(@PathVariable("name") String name, 
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
	

	@RequestMapping(method= {RequestMethod.OPTIONS, RequestMethod.HEAD, RequestMethod.TRACE, RequestMethod.PATCH})
	public String unSupportedRequest() {
		return "not supported requests";
	}
	
	
	
	
}
