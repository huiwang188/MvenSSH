package com.abc.service;

import java.util.List;

import com.abc.bean.Department;

public interface DepartmentService {

	/**
	 * 根据ID获取部门
	 * @param id
	 * @return
	 */
	Department getDepartmentById(String id);
	//获取全部部门
	List<Department> getDepartmentByAll();
	
	void add(Department dep);
	void update(Department dep);
	void delete(String id);

}