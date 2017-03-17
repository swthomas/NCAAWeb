<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add College</title>
</head>
<body>
	<h2>Add New College</h2>
	<form action="addCollege.do" method="POST">
		<table>
			<tr><td>College: </td><td><input type="text" name="name"></td></tr>
			<tr><td>Division: </td><td><input type="text" name="division"></td></tr>
			<tr><td>Mascot: </td><td><input type="text" name="mascot"></td></tr>
			<tr><td>Coach: </td><td><input type="text" name="coach"></td></tr>
		</table>
		
		<input type="submit" value="Submit"/>
</form>

</body>
</html>