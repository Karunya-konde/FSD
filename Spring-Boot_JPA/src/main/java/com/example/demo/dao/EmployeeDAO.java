package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeDAO {
	public List<Employee> getAllEmployee();
	public Employee save(Employee employee);
	public Employee findById(int id);
	public void delete(int id);
	public Employee update(int id,Employee e);
	public List<Employee> findByFirstName(String firstName);
	}

