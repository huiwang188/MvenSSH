package com.abc.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.abc.bean.Department;
import com.abc.dao.DepartmentDao;
import com.abc.utils.HibernateUtils;
@Repository
public class DepartmentDaoImpl implements DepartmentDao {
	
	/**
	 * 根据ID获取部门
	 * @param id
	 * @return
	 */
	@Override
	public Department selectById(String id) {
		Session session = HibernateUtils.getCurrentSession();
		return session.load(Department.class, id);
	}
	/**
	 * 获取所有部门
	 */
	@Override
	public List<Department> selectByAll(){
		Session session = HibernateUtils.getCurrentSession();
		Query<Department> query = session.createQuery("from Department",Department.class);
		return query.getResultList();
	}
	@Override
	public void deleteById(String id) {
		Session session = HibernateUtils.getCurrentSession();
		Department department = session.load(Department.class, id);
		session.delete(department);
		
	}
	@Override
	public void insert(Department dept) {
		Session session = HibernateUtils.getCurrentSession();
		session.save(dept);
		
	}
	@Override
	public void update(Department dept) {
		Session session = HibernateUtils.getCurrentSession();
		session.update(dept);
		
	}
}
