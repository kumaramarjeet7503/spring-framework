<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <% 
  	String name = (String) request.getAttribute("name") ;
  String company = (String) request.getAttribute("company") ;
  %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>

<h1>This is home jsp</h1>

<h3><%= name %></h3>
<h3><%= company %></h3>
</body>
</html>