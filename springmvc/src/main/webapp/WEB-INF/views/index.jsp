<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HomePage</title>
</head>
<body>
This is homePage.....

<%
String name=(String)request.getAttribute("name");

%>
<h3>Name is :- <%=name %> ....</h3>
</body>
</html>