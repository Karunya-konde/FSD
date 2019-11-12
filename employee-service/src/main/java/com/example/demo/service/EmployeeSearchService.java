package com.example.demo.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.employeeDAO;
import com.example.demo.entity.Employee;

@Service
public class EmployeeSearchService {

	private static List<Employee> employeeRepsitory =  new ArrayList<Employee>();
	
	@SuppressWarnings("unused")
	@Autowired
	private employeeDAO employeeDao ;
	

	@Transactional
	public List<Employee> findAll() {
		return employeeDao.findAll();
	}


	@Transactional
	public Employee save(Employee theEmployee) {
		return employeeDao.save(theEmployee);
	}
}
	
	