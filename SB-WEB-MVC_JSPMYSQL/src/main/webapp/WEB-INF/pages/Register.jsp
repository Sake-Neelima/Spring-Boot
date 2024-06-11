<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Registration</title>
<!-- Bootstrap CSS -->
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h3 class="text-center text-primary">Welcome to the Employee Register Page</h3>
    <form action="/add" method="POST" class="mt-4 mx-auto bg-light p-4 rounded" style="max-width: 600px;">
        <div class="form-group row">
            <label for="eid" class="col-sm-4 col-form-label text-right text-dark">EmpId:</label>
            <div class="col-sm-8">
                <input type="number" class="form-control" id="eid" name="eid" required>
            </div>
        </div>
        <div class="form-group row">
            <label for="ename" class="col-sm-4 col-form-label text-right text-dark">EmpName:</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="ename" name="ename" required>
            </div>
        </div>
        <div class="form-group row">
            <label for="esal" class="col-sm-4 col-form-label text-right text-dark">EmpSal:</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="esal" name="esal" required>
            </div>
        </div>
        <div class="form-group row">
            <label for="edept" class="col-sm-4 col-form-label text-right text-dark">EmpDep:</label>
            <div class="col-sm-8">
                <select class="form-control" id="edept" name="edept" required>
                    <option value="cse">CSE</option>
                    <option value="ece">ECE</option>
                    <option value="mech">MECH</option>
                    <option value="chem">CHEM</option>
                </select>
            </div>
        </div>
        <div class="form-group row">
            <div class="col-sm-8 offset-sm-4">
                <button type="submit" class="btn btn-primary">Add</button>
                <a href="/all" class="btn btn-info ml-2">Show Data</a>
            </div>
        </div>
        <div class="form-group row">
            <div class="col-sm-8 offset-sm-4">
                <p class="text-success">${msg}</p>
            </div>
        </div>
    </form>
</div>
<!-- Bootstrap JS and dependencies -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
