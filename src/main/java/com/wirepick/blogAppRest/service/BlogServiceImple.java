package com.wirepick.blogAppRest.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wirepick.blogAppRest.entity.Blog;
import com.wirepick.blogAppRest.repo.BlogRepo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class BlogServiceImple implements BlogService {
	
	private BlogRepo blogRepo;
	
	@Override
	public Iterable<Blog> findAll() {
		
		return blogRepo.findAll();
	}

	@Override
	public Blog findById(Long id) {
		
		Blog blog= blogRepo.findById(id).get();
	}

	@Override
	public boolean exists(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void delete(Blog blog) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Blog save(Blog blog) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Blog> findByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
