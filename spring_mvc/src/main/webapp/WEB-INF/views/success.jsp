    <% 
    	String name = (String) request.getAttribute("name") ;
    	String email = (String) request.getAttribute("email") ;
    	String password = (String) request.getAttribute("password") ;
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

<h1>Registeration Details</h1>

<h3>Name : <%= name %> </h3>
<h3>Email : <%= email %>  </h3>
<h3>Password : <%= password %> </h3>
</body>
</html>