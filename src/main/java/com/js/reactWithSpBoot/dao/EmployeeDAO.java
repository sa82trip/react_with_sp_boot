package com.js.reactWithSpBoot.dao;

import java.util.List;

import com.js.reactWithSpBoot.modal.Employee;

public interface EmployeeDAO {

	
	List<Employee> get();
	Employee get(int id);
	void save(Employee employee);
	void delete(int id);
}
