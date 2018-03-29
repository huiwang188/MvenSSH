package com.abc.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abc.bean.Employee;
import com.abc.dao.EmployeeDao;
import com.abc.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;
	@Override
	@Transactional
	public Employee getById(String id) {
		
		return employeeDao.selectById(id);
		
	}

	@Override
	@Transactional
	public List<Employee> getByAll() {
		return employeeDao.selectByAll();
	}

	@Override
	@Transactional
	public void add(Employee emp) {
		employeeDao.insert(emp);
		
	}

	@Override
	@Transactional
	public void update(Employee emp) {
		employeeDao.update(emp);
		
	}

	@Override
	@Transactional
	public void delete(String id) {
		employeeDao.delete(id);
		
	}

}
