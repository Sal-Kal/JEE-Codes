<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enter Details</title>
</head>
<body>
<form action="it" method="get">
	Name: <input type="text" name="name"/>
	<br>
	<br>
	Gender: <select name="gender">
		<option>male</option>
		<option>female</option>	
	</select>
	<br>
	<br>
	Salary: <input type="number" name="salary"/>
	<br>
	<br>
	Deductible: <input type="number" name="deduct"/>
	<br>
	<br>
	<input type="submit"/>
</form>
</body>
</html>