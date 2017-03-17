<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Delete College</title>
</head>
<body>

	<h1>Pick a College to Delete</h1>

	<div>
		<form method="POST" action="DeleteCollege.do">
			<select class="selector" name="name">
				<option value=""></option>
				<c:forEach var="college" items="${collegeList}">
					<option value="${college.name}">${college.name}</option>
				</c:forEach>
			</select><br> <input name="button" type="submit" value="Delete College">

		</form>
	</div>

</body>