package com.revature.dao;

import java.util.List;

import com.revature.models.Post;

public interface PostDao {
	Post getPostById(int id);
	List<Post> getPosts();
	List<Post> getPostsByPage(int page);
	List<Post> getPostsByUserId(String id);
	List<Post> getPostsByGroupId(int id);
	List<Post> getPostsByGroupName(String name);
	int createPost(Post post);
	void deletePost(Post post);
	Post updatePost(Post post);
}
