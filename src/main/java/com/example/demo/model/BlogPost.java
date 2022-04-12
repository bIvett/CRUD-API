package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BlogPost {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long blogPostId;
	private String blogger;
	private Date blogPostDate;
	private String blogPostTitle;
	@Column(columnDefinition = "TEXT")
	private String blogPostContent;
	private String blogPostLabel;
	
	public BlogPost() {
		
	}

	public BlogPost(String blogger, Date blogPostDate, String blogPostTitle, String blogPostContent,
			String blogPostLabel) {
		super();
		this.blogger = blogger;
		this.blogPostDate = blogPostDate;
		this.blogPostTitle = blogPostTitle;
		this.blogPostContent = blogPostContent;
		this.blogPostLabel = blogPostLabel;
	}

	public Long getBlogPostId() {
		return blogPostId;
	}

	public void setBlogPostId(Long blogPostId) {
		this.blogPostId = blogPostId;
	}

	public String getBlogger() {
		return blogger;
	}

	public void setBlogger(String blogger) {
		this.blogger = blogger;
	}

	public Date getBlogPostDate() {
		return blogPostDate;
	}

	public void setBlogPostDate(Date blogPostDate) {
		this.blogPostDate = blogPostDate;
	}

	public String getBlogPostTitle() {
		return blogPostTitle;
	}

	public void setBlogPostTitle(String blogPostTitle) {
		this.blogPostTitle = blogPostTitle;
	}

	public String getBlogPostContent() {
		return blogPostContent;
	}

	public void setBlogPostContent(String blogPostContent) {
		this.blogPostContent = blogPostContent;
	}

	public String getBlogPostLabel() {
		return blogPostLabel;
	}

	public void setBlogPostLabel(String blogPostLabel) {
		this.blogPostLabel = blogPostLabel;
	}
	
}