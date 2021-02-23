<%@page import="CRUD.Insert_value"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	 String id = request.getParameter("id");
	String email =  request.getParameter("email");
	String mobile =  request.getParameter("mobile");
	String user_name =  request.getParameter("user_name");
	
	Insert_value obj_Insert_value = new Insert_value();
	obj_Insert_value.insert_values(id, user_name, email, mobile);
	
	%>
    Finished


</body>
</html>