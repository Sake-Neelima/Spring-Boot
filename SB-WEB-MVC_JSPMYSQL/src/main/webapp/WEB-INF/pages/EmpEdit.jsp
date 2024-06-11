<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Employee</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h3 class="text-center mb-4">Welcome to Employee Edit Page</h3>
    <div class="row justify-content-center">
        <div class="col-md-6">
            <form:form action="/Aupdate" method="POST" modelAttribute="employee" class="card p-4">
                <div class="form-group">
                    <label for="eid">Empid:</label>
                    <form:input path="eid" readonly="true" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="ename">EmpName:</label>
                    <form:input path="ename" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="esal">Empsal:</label>
                    <form:input path="esal" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="edept">EmpDept:</label>
                    <form:select path="edept" class="form-control">
                        <option value="cse">CSE</option>
                        <option value="ece">ECE</option>
                        <option value="civil">CIVIL</option>
                        <option value="chem">CHEM</option>
                    </form:select>
                </div>
                <button type="submit" class="btn btn-primary">UPDATE</button>
            </form:form>
        </div>
    </div>
</div>
</body>
</html>
