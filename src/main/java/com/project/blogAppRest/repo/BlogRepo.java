package com.wirepick.blogAppRest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wirepick.blogAppRest.entity.Blog;

public interface BlogRepo extends JpaRepository<Blog, Long> {

}
