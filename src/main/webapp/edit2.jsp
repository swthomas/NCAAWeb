<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<link rel="stylesheet" href="style2.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>NCAAWeb App</title>
</head>
<body>
	<h1>Colleges of the BigTen</h1>
	<img src="pics/bigTen.jpg">


	<div id="selectName">
		<form method="GET" action="GetCollege.do">
			<select class="selector" name="name">
				<option value=""></option>
				<c:forEach var="college" items="${collegeList}">
					<option value="${college.name}">${college.name}</option>
				</c:forEach>
			</select><br> <input name="button" type="submit" value="Search by College">

		</form>
	</div>

	<div id="selectCoach">
		<form method="GET" action="GetColleges.do">
			<select class="selector" name="conference">
				<option value=""></option>
				<option value="Atlantic Coast Conference">ACC</option>
				<option value="Big Ten">Big Ten</option>
			</select><br> <input class="button" type="submit"
				value="Search by Conference">
		</form>
	</div>

	<div id="selectDivision">
		<form method="GET" action="GetColleges.do">
			<select class="selector" name="division">
				<option value=""></option>
				<option value="ACC Coastal">ACC Coastal</option>
				<option value="ACC Atlantic">ACC Atlantic</option>
				<option value="East Division">East Division</option>
				<option value="West Division">West Division</option>
			</select><br> <input class="button" type="submit"
				value="Search by Division">
		</form>
	</div>

	<form action="addCollege.jsp" method="GET">
		<input type="submit" value="Add College" />
	</form>

</body>
</html>