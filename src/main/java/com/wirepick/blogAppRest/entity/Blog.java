package com.wirepick.blogAppRest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor @AllArgsConstructor
public class Blog {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private  Long id;
	private  String title;
	private  String content;

}
