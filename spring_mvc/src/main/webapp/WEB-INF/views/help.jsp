<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <% String name = (String) request.getAttribute("name") ;  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is help</title>
</head>
<body>

<h1>This is help</h1>
<h2>Name : <%= name %></h2>

</body>
</html>