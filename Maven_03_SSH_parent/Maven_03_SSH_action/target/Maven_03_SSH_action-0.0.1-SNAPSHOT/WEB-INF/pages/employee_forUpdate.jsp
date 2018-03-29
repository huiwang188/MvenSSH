<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-dojo-tags" prefix="sx"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<sx:head parseContent="true"/> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工信息</title>
</head>
<body>
	<h1>员工信息</h1>
	<s:form action="employee_update"  method="post">
		<s:textfield name="employee.id" label="ID"></s:textfield>
		<s:textfield name="employee.lastName" label="姓名"></s:textfield>
		<s:radio list="#{'1':'男','0':'女' }" name="employee.gender" label="性别" ></s:radio>
		<s:textfield name="employee.age" label="年龄"></s:textfield>
		<sx:datetimepicker name="employee.birthday" displayFormat="yyyy-MM-dd" label="生日" ></sx:datetimepicker>
		<s:select list="#session.dept" name="employee.department.id" listKey="id" listValue="name" >
		</s:select>
		<s:submit value="提交"></s:submit>
	</s:form>
</body>
</html>