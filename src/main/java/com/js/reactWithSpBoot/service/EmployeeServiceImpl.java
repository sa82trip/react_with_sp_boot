package com.js.reactWithSpBoot.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.reactWithSpBoot.dao.EmployeeDAO;
import com.js.reactWithSpBoot.modal.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDAO employeeDao;

	@Transactional
	@Override
	public List<Employee> get() {
		return employeeDao.get();
	}

	@Transactional
	@Override
	public Employee get(int id) {
		return employeeDao.get(id);
	}

	@Transactional
	@Override
	public void save(Employee employee) {
		employeeDao.save(employee);
	}

	@Transactional
	@Override
	public void delete(int id) {
	 employeeDao.delete(id);	
	}

}
