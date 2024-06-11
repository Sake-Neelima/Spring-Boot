<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Welcome to Register Page</h3>

<form action="/data" method="POST">
<pre>
EmpId:<input type="text" name="empid"/>
EmpName:<input type="text" name="empname"/>
EmpSal:<input type="text" name="empsal"/>
EmpDept:<input type="text" name="empdept"/>
<input type="submit" value="create"/>
</pre>
</form>
</body>
</html>