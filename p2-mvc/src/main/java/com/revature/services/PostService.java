package com.revature.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.dao.PostDao;
import com.revature.dao.PostDaoImpl;
import com.revature.models.Post;

@Service
public class PostService {
	
	private PostDao pd = new PostDaoImpl();
	
	public PostService() {
		
	}
	
	public List<Post> findAllPosts() {
		List<Post> posts = pd.getPosts();
		return posts;
	}
	
	public List<Post> findPostsByGroupName(String name) {
		List<Post> posts = pd.getPostsByGroupName(name);
		return posts;
	}
	
	public Post createPost(Post post) {
		pd.createPost(post);
		return post;
	}
	
	public Post deletePost(Post post) {
		pd.deletePost(post);
		return post;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pd == null) ? 0 : pd.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PostService other = (PostService) obj;
		if (pd == null) {
			if (other.pd != null)
				return false;
		} else if (!pd.equals(other.pd))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PostService [pd=" + pd + "]";
	}
	
	
	
	
}
