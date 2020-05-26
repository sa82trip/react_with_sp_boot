package com.js.reactWithSpBoot.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.js.reactWithSpBoot.modal.Employee;
import org.hibernate.Session;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
	
	@Autowired
	private EntityManager entityManager;
	
	

	@Override
	public List<Employee> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);
		List<Employee> list = query.getResultList();
		return list;
	}

	@Override
	public Employee get(int id) {
		Session currSession = entityManager.unwrap(Session.class);
		Employee employee = currSession.get(Employee.class, id);
		return employee;
	}

	@Override
	public void save(Employee employee) {
		Session currSession = entityManager.unwrap(Session.class);
		currSession.saveOrUpdate(employee);
		
	}

	@Override
	public void delete(int id) {
		Session currSession = entityManager.unwrap(Session.class);
		Employee employee = currSession.get(Employee.class, id);
		currSession.delete(employee);
	}

}
