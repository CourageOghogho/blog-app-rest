package com.wirepick.blogAppRest.service;

import com.wirepick.blogAppRest.entity.Blog;

public interface BlogService {
	
	Iterable<Blog> findAll();

	Blog findById(Long id);

	boolean exists(Long id);

	void delete(Blog blog);

	Blog save(Blog blog);

	Iterable<Blog> findByTitle(String title);

}
