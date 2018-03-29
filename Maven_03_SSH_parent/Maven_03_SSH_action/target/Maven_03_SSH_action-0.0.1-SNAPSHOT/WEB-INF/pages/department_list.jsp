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
	<h1>部门列表</h1>
	<hr>
	<table border="1" width="30%">
		<tr>
			<td>
				ID
			</td>
			<td>
				名称
			</td>
			<td>
				操作
			</td>
		</tr>
		<s:iterator var="dep" value="#session.depts">
			<tr>
				<td>
					<s:property value="id"/>
				</td>
				<td>
					<s:property value="name"/>
				</td>
				<td>
					<a href="department_forUpdate?id=${dep.id}">修改</a>
					<a href="department_del?id=${dep.id}">删除</a>
				</td>
			</tr>
		</s:iterator>
	</table>
	
</body>
</html>