package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BlogPost;
import com.example.demo.service.BlogPostService;

@RestController
public class HomeController {
	
	BlogPostService blogPostService;
	
	@Autowired
	public HomeController(BlogPostService blogPostService) {
		super();
		this.blogPostService = blogPostService;
	}
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/create",
					method = {RequestMethod.POST, RequestMethod.GET})
	private BlogPost createBlogPost(@RequestBody BlogPost blogPost) {
	blogPostService.create(blogPost);
	return blogPost;
	}
	
	@GetMapping("/read")
	private List<BlogPost> readBlogPost() {
	return blogPostService.read();
	}
	
	@PutMapping("/update")  
	private BlogPost updateBlogPost(@RequestBody BlogPost blogPost) {  
	blogPostService.update(blogPost);  
	return blogPost;  
	}  
	
	@RequestMapping(value="/delete/{blogPostId}",
					method = {RequestMethod.DELETE, RequestMethod.GET})
	private String deleteBlogPost(@PathVariable("blogPostId") Long blogPostId) {
	blogPostService.delete(blogPostId);
	return "Blog post with ID " + blogPostId + " deleted successfully." ;
	}
	
}