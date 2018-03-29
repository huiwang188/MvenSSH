package com.abc.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.abc.bean.Employee;
import com.abc.dao.EmployeeDao;
import com.abc.utils.HibernateUtils;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Override
	public Employee selectById(String id) {
		Session session = HibernateUtils.getCurrentSession();
		return session.get(Employee.class, id);
		
	}

	@Override
	public List<Employee> selectByAll() {
		Session session = HibernateUtils.getCurrentSession();
		Query<Employee> query = session.createQuery("from Employee", Employee.class);
		return query.getResultList();
	}

	@Override
	public void insert(Employee emp) {
		Session session = HibernateUtils.getCurrentSession();
		session.save(emp);
	}

	@Override
	public void update(Employee emp) {
		Session session = HibernateUtils.getCurrentSession();
		session.update(emp);
	}

	@Override
	public void delete(String id) {
		Session session = HibernateUtils.getCurrentSession();
		Employee employee = session.load(Employee.class, id);
		session.delete(employee);
		
	}

}
