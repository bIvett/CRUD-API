package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BlogPost;
import com.example.demo.repository.BlogPostRepository;

@Service
public class BlogPostService {

	private BlogPostRepository blogPostRepository;

	@Autowired
	public BlogPostService(BlogPostRepository blogPostRepository) {
		super();
		this.blogPostRepository = blogPostRepository;
	}
	
	public void create(BlogPost blogPost) {
		blogPostRepository.save(blogPost);
	}
	
	public List<BlogPost> read() {
		return blogPostRepository.findAll();
	}
	
	public void update(BlogPost blogPost) {
		blogPostRepository.save(blogPost);	
	}

	public void delete(Long blogPostId) {
		blogPostRepository.deleteById(blogPostId);
	}

}