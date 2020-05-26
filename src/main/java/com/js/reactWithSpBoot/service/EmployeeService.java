package com.js.reactWithSpBoot.service;

import java.util.List;

import com.js.reactWithSpBoot.modal.Employee;

public interface EmployeeService {

	List<Employee> get();
	Employee get(int id);
	void save(Employee employee);
	void delete(int id);
}
