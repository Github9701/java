package com.posts.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.posts.entities.Posts;

public interface PostRepository extends JpaRepository<Posts, Integer> {

}
