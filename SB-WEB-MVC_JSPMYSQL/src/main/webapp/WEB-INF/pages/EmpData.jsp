<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Data Page</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5 text-center">
    <h3 class="text-primary">Welcome To Employee Data Page!!</h3>
    <table class="table table-bordered mt-4">
        <thead class="thead-dark">
            <tr>
                <th class="text-info">EMPID</th>
                <th class="text-info">EMPNAME</th>
                <th class="text-info">EMPSAL</th>
                <th class="text-info">EMPDEPT</th>
                <th class="text-info">HRA</th>
                <th class="text-info">DA</th>
                <th class="text-info">Delete</th>
                <th class="text-info">Edit</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${List}" var="ob">
                <tr>
                    <td>${ob.eid}</td>
                    <td>${ob.ename}</td>
                    <td>${ob.esal}</td>
                    <td>${ob.edept}</td>
                    <td>${ob.hra}</td>
                    <td>${ob.da}</td>
                    <td><a href="delete?eid=${ob.eid}" class="btn btn-danger">DELETE</a></td>
                    <td><a href="Bupdate?eid=${ob.eid}" class="btn btn-primary">EDIT</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <hr/>
    <c:if test="${page.hasPrevious()}">
        <a href="?page=${page.getNumber()-1}" class="btn btn-secondary">PREVIOUS</a>&nbsp;&nbsp;
    </c:if>

    <c:forEach var="i" begin="0" end="${page.getTotalPages()-1}">
        <a href="?page=${i}" class="btn btn-info">${i+1}</a>&nbsp;&nbsp;
    </c:forEach>

    <c:if test="${page.hasNext()}">
        <a href="?page=${page.getNumber()+1}" class="btn btn-secondary">NEXT</a>&nbsp;&nbsp;
    </c:if>
</div>
</body>
</html>
