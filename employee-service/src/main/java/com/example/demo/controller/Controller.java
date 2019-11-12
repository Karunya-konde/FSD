package com.example.demo.controller;



import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeSearchService;


@RefreshScope

@RestController
@RequestMapping("/api")
public class Controller {

	@Autowired

	EmployeeSearchService employeeSearchService;

	@RequestMapping("/employees")
	public Collection<Employee> findAll() {
		return employeeSearchService.findAll();

	}
	@PostMapping("/employees")
	public void save(@RequestBody Employee emp) {
		employeeSearchService.save(emp);

	}

}