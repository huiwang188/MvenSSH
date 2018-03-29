<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>MAVAN项目SSH工程</h1>
	<hr>
	<br>
	<a href="index">访问getIndex</a>
	<br>
	
	<hr>
	<br>
		<fieldset style="width: 40%">
			<legend>部门测试</legend>
			<a href="department_forAdd">添加部门</a>
			<br>
			<a href="department_getById?id=2">访问getDepartmentById获取部门</a>
			<br>
			<a href="department_getAll">访问department_getAll获取全部部门</a>
		</fieldset>
	<br>
	<br>
		<fieldset style="width: 40%">
			<legend>员工测试</legend>
			<a href="employee_forAdd">添加员工</a>
			<br>
			<a href="employee_getById?id=2">访问employeeById获取员工</a>
			<br>
			<a href="employee_getByAll">访问employee_getByAll获取全部员工</a>
		</fieldset>
	<br>
	<hr>
	<fieldset style="width: 40%">
		<legend>struts2测试</legend>
			<form action="login" method="post">
				<table>
					<tr>
						<td>用户名</td>
						<td>
							<input type="text" name="lastName">
						</td>
					</tr>
					
					<tr>
						<td>密码</td>
						<td>
							<input type="password" name="password">
						</td>
					</tr>
					<tr align="right">
						<td>
							<input type="reset" value="重置">
						</td>
						<td>
							<input type="submit" value="登录">
						</td>
					</tr>
				</table>
			</form>
	</fieldset>
</body>
</html>