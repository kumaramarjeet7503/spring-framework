<%@ page import="com.spring.model.User" %>
    <% 
    	//String name = (String) request.getAttribute("name") ;
    	//String email = (String) request.getAttribute("email") ;
    	//String password = (String) request.getAttribute("password") ;
    	User user = (User) request.getAttribute("user") ;
    	String heading = (String) request.getAttribute("header") ;
    	String description = (String) request.getAttribute("description") ;
    %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>

<h1> <%=  heading %></h1>
<p> <%=  description %></p>

<h3>Name : <%= user.getName() %> </h3>
<h3>Email : <%= user.getEmail() %>  </h3>
<h3>Password : <%= user.getPassword() %> </h3>
</body>
</html>