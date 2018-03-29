package com.abc.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.abc.bean.Department;
import com.abc.service.DepartmentService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
@Component
@Scope("prototype")
public class DepartmentAction extends ActionSupport {


	private static final long serialVersionUID = 1L;
	
	@Autowired
	private DepartmentService deptService;

	private String id;
	private Department dept;
	private List<Department> depts = new ArrayList<>();
	
	public String getById() {
		ActionContext context = ActionContext.getContext();
		Department dept = deptService.getDepartmentById(id);
		context.getSession().put("depts", dept);
		return "list";
	}
	
	public String getAll() {
		
		List<Department> depts = deptService.getDepartmentByAll();
		ActionContext context = ActionContext.getContext();
		context.getSession().put("depts", depts);
		return "list";
	}
	
	//转发添加页面
	public String forAdd() {
		System.out.println("访问了forAdd方法");
		return "forAdd";
	}
	//转发添加页面
	public String forUpdate() {
		System.out.println("访问了forUpadte方法");
		dept = deptService.getDepartmentById(id);
		System.out.println(dept);
		return "forUpdate";
	}
	
	//删除
	public String del() {
		System.out.println("访问了Del方法");
		deptService.delete(id);
		return SUCCESS;
	}
	
	public String add() {
		System.out.println("放完了Add方法");
		System.out.println(dept.getName());
		deptService.add(dept);
		
		return SUCCESS;
	}
	
	public String update() {
		deptService.update(dept);
		return SUCCESS;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}

	public List<Department> getDepts() {
		return depts;
	}

	public void setDepts(List<Department> depts) {
		this.depts = depts;
	}
	
	
	

}
