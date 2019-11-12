package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;




import com.example.demo.entity.Employee;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
	
	private EntityManager entityManager;
	@Autowired
	public EmployeeDAOImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("From Employee");
		return query.getResultList();

}
	@Transactional
	public Employee save(Employee employee) {
		// TODO Auto-generated method stub
		 entityManager.persist(employee);
		return employee;

}
	@Transactional
	public Employee findById(int id) {
		Employee e= entityManager.find(Employee.class, id);
		return e;
		
	}
	@Transactional
	public void delete(int id) {
		Employee e= entityManager.find(Employee.class, id);
		entityManager.remove(e);
	}
	@Transactional
	public Employee update(int id,Employee e)
	{
		Employee emp= entityManager.find(Employee.class, id);
		emp.setFirstName(e.getFirstName());
		emp.setLastName(e.getLastName());
		emp.setSalary(e.getSalary());
		entityManager.merge(emp);
		return emp;
		
	}
	@Transactional
	public List<Employee> findByFirstName(String firstName) {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("From Employee e where e.firstName=:firstName").setParameter("firstName", firstName);
		return query.getResultList();

}
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}
	

}