<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>员工列表</h1>
	<hr>
	<table border="1" width="50%">
		<tr>
			<td>ID</td>
			<td>名称</td>
			<td>性别</td>
			<td>年龄</td>
			<td>生日</td>
			<td>部门</td>
			<td>操作</td>
			
		</tr>
		<s:iterator var="emp" value="#session.emp">
			<tr>
				<td>
					<s:property value="id"/>
				</td>
				<td>
					<s:property value="lastName"/>
				</td>
				<td>
					<s:if test="gender == 1">男</s:if>
					<s:else>女</s:else>
				</td>
				<td>
					<s:property value="age"/>
				</td>
				<td>
					<s:date name="birthday" format="yyyy-MM-dd"/>
				</td>
				<td>
					<s:property value="department.name"/>
				</td>
				<td>
					<a href="employee_forUpdate?id=${emp.id}">修改</a>
					<a href="employee_del?id=${emp.id}">删除</a>
				</td>
			</tr>
		</s:iterator>
	</table>
	
</body>
</html>