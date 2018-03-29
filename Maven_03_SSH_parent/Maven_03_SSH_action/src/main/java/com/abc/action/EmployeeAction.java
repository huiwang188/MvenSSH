package com.abc.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.abc.bean.Department;
import com.abc.bean.Employee;
import com.abc.service.DepartmentService;
import com.abc.service.EmployeeService;
import com.opensymphony.xwork2.ActionContext;
@Component
@Scope("prototype")
public class EmployeeAction {
	
	@Autowired
	private EmployeeService empService;
	@Autowired
	private DepartmentService deptService;
	private String id;
	private Employee employee;
	public String getById() {
		ActionContext context = ActionContext.getContext();
		Employee employee = empService.getById(id);
		context.getSession().put("emp", employee);
		return "list";
	}
	public String getByAll() {
		ActionContext context = ActionContext.getContext();
		List<Employee> list = empService.getByAll();
		context.getSession().put("emp", list);
		return "list";
	}
	
	public String forAdd() {
		List<Department> list = deptService.getDepartmentByAll();
		ActionContext.getContext().getSession().put("dept", list);
		return "forAdd";
	}
	public String add() {
		empService.add(employee);
		return "success";
	}
	
	public String forUpdate() {
		List<Department> list = deptService.getDepartmentByAll();
		ActionContext.getContext().getSession().put("dept", list);
		employee = empService.getById(id);
		return "forUpdate";
	}
	
	public String update() {
		empService.update(employee);
		return "success";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
