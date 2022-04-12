package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.BlogPost;

public interface BlogPostRepository extends CrudRepository<BlogPost, Long> {
	
	List<BlogPost> findAll();
	
}