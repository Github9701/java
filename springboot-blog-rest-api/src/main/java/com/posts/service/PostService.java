package com.posts.service;

import java.util.List;

import com.posts.entities.Posts;

public interface PostService {
	Posts createpost(Posts posts);
	List<Posts> getAllPosts();
	Posts updatePost(int id);
	void deletePostById(int id);

}
