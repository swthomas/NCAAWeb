<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	${college.name}
	<br> ${college.mascot}
	<br> ${college.coach}
	<br> ${college.division}
	<br>
	<img style="width: 20%" src="pics/${college.pic}">
	<br>

	<c:forEach items="${teams}" var="team">
		${team.name}
		<c:forEach items="${team.players}" var="player">
			{player.name}
			{player.height}
		</c:forEach>
	</c:forEach>

	<form action="DeleteCollege.do" method="POST">
		<button type="submit" name="name" value="${college.name}" >DELETE</button>
	</form>
	
	<form action="edit.jsp" method="POST">
		<button type="submit" name="name" value="${college}" >Edit</button>
	</form>

</body>
</html>