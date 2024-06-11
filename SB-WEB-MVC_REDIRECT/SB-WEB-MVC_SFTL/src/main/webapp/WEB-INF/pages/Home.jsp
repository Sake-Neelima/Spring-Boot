<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>WELCOME TO EMPLOYEE REGISTER PAGE</h3>
<form:form action="/show" method="post" modelAttribute="employee">
<pre>
    Empid:<form:input path="empId" /><br><br>
    EmpName:<form:input path="empName" /><br><br>
    EmpSal:<form:input  path="empSal" /><br><br>
    Password:<form:password  path="empPwd" /><br><br>
    
    Gender:<br>
    <form:radiobutton path="empGen" value="0" /> Male<br>
    <form:radiobutton path="empGen" value="1"/> Female<br>
    <form:radiobutton path="empGen" value="2"/> Other<br><br>
    
    Dept:
    <form:select path="empDep">
        <option value="">-SELECT-</option>
        <option value="DEV">DEV</option>
        <option value="TEST">TEST</option>
        <option value="QA">QA-</option>
        <option value="BA">BA</option>
    </form:select><br><br>
    
    Address:<form:textarea path="empAdd" ></form:textarea><br><br>
    
    Languages:<br>
    <form:checkbox path="empLang" value="ENG"/> ENG<br>
    <form:checkbox path="empLang" value="TEL"/> TEL<br>
    <form:checkbox path="empLang" value="MATH"/> MATH<br><br>
    
    projects:
    <form:select path="empProj" multiple="multiple">
        <option value="">-SELECT-</option>
        <option value="DHTC">DHTC</option>
        <option value="MLO">MLO</option>
        <option value="AI">AI</option>
        <option value="ML">ML</option>
    </form:select><br><br>
    
    <input type="submit" value="Submit"/>
</pre>
</form:form>

</body>
</html>
