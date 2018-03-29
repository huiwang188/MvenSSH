package com.abc.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abc.bean.Department;
import com.abc.dao.DepartmentDao;
import com.abc.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentDao dept;
	
	/* (non-Javadoc)
	 * @see com.abc.service.impl.DepartmentService#getDepartmentById(java.lang.String)
	 */
	@Override
	@Transactional 
	public Department getDepartmentById(String id) {
		return dept.selectById(id);
	}
	
	/* (non-Javadoc)
	 * @see com.abc.service.impl.DepartmentService#getDepartmentByAll()
	 */
	@Override
	@Transactional
	public List<Department> getDepartmentByAll(){
		return dept.selectByAll();
	}
	/**
	 * 新增部门
	 * @param dep
	 */
	@Override
	@Transactional
	public void add(Department dep) {
		dept.insert(dep);
	}
	
	/**
	 * 更新部门信息
	 * @param dep
	 */
	@Override
	@Transactional
	public void update(Department dep) {
		dept.update(dep);
	}
	
	/**
	 * 根据ID删除部门
	 * @param id
	 */
	@Override
	@Transactional
	public void delete(String id) {
		dept.deleteById(id);
	}
	
}
