package com.mycompany.org.HibernateCrudeDemo.dao.copy;
import java.util.List;

import java.util.List;

import  com.mycompany.org.HibernateCrudeDemo.shared.SharedEmployee;

public interface EmployeeDOA {

	public void createEmployee(SharedEmployee sEmployee);
	public List<SharedEmployee> getAllEmployee();
	public SharedEmployee findById(int id);
	public void findByCustomId(String customId);
	public void deleteEmployee(int id);
	}
