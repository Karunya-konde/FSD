package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.User;

@RestController
@RequestMapping("/api")
public class Controller {

	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	public Controller(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}
	@PostMapping("/login")
	public User findPeers(@RequestBody User user) {

		String url = "http://b8java22.iiht.tech:1112/api/validate";
		System.out.println("URL" + url);

		@SuppressWarnings("unchecked")
		User list = restTemplate.postForObject(url,user,User.class);

		System.out.println("RESPONSE " + list);

		return list;

	}

	
}
