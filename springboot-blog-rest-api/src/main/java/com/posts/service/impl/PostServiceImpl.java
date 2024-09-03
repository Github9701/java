package com.posts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.posts.entities.Posts;
import com.posts.repos.PostRepository;
import com.posts.service.PostService;

public class PostServiceImpl implements PostService {
	
	@Autowired
	PostRepository postRepo;

	@Override
	public Posts createpost(Posts posts) {
		
		return postRepo.save(posts);
	}

	@Override
	public List<Posts> getAllPosts() {
		
		return postRepo.findAll();
	}

	@Override
	public Posts updatePost(int id) {
		
		return null;
	}

	@Override
	public void deletePostById(int id) {
		

	}

}
