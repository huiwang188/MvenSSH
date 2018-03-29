package com.abc.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.abc.bean.Employee;
import com.abc.service.EmployeeService;

@Controller
@Scope("prototype")
public class LoginAction {
	private String lastName;
	private String password;
	@Autowired
	private EmployeeService empService;

	public String login() {
		System.out.println("登录用户名=" + lastName + ",密码=" + password);
		Employee emp = empService.getById("1");
		System.out.println(emp + "1111");
		return "success";
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
