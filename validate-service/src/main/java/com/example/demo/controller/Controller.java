package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.User;

@RefreshScope

@RestController
@RequestMapping("/api")
public class Controller {

	@Autowired

	UserRepository userrepository;

	@PostMapping("/validate")
	public User findAll(@RequestBody User user) {
		return userrepository.findByUsername(user.getUsername());
	

	}
	@PostMapping("/insert")
	public void insert(@RequestBody User user) {
		userrepository.insert(user);
	}

}
