<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
	<h1>Insert Value</h1>
		<form action="controller/insert_controller.jsp">
			id: <input type="text" name="id" autofocus="autofocus"><br>
			User Name: <input type="text" name="user_name"><br>
			Mobile : <input type="text" name="mobile"><br>
			E-Mail: <input type="text" name="email"><br>
			
			<input type="submit" value="Insert">
		</form>
</center>
</body>
</html>