<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Required meta tags always come first -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>Inventory Management SpringMVC</title>

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
<link
	href="https://fonts.googleapis.com/css?family=Raleway:500,900|Quicksand"
	rel="stylesheet">
<link rel="stylesheet" href="main.css">

<!-- jQuery -->
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.10.0.min.js"></script>

<script>
	// A $( document ).ready() block.
	$(document).ready(function() {
		console.log("ready!");
	});
</script>
</head>

<body>
	<div class="index-main">


		<!--Begin Navbar-->
		<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<h4>
					<a href="GetColleges.do">NCAA Football</a>
				</h4>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav navbar-right">
					<li><a class="bold" href="GetTeams.do">Teams</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Conferences<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a class="bold"
								href="GetColleges.do?conference=Atlantic Coast Conference">ACC</a></li>
							<li><a class="bold" href="GetColleges.do?conference=Big Ten">Big
									Ten</a></li>
						</ul></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Divisions<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<%-- <a href="GetCollege.do?name=${college.name}"> --%>
							<li><a class="bold"
								href="GetColleges.do?division=ACC Coastal">ACC Coastal</a></li>
							<li><a class="bold"
								href="GetColleges.do?division=ACC Atlantic">ACC Atlantic</a></li>
							<li><a class="bold"
								href="GetColleges.do?division=East Division">East Division</a></li>
							<li><a class="bold"
								href="GetColleges.do?division=West Division">West Division</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
		</nav>


		<div class="teamInfo">
			<br> <img style="width: 20%" src="pics/${college.pic}"> <br>
			<br>

			<table id="teamInfoTable">
				<tr>
					<td class="title">College:</td>
					<td class="adjusted">${college.name}</td>
				</tr>
				<tr>
					<td class="title">Conference:</td>
					<td class="adjusted">${college.conference}</td>
				</tr>
				<tr>
					<td class="title">Division:</td>
					<td class="adjusted">${college.division}</td>
				</tr>
				<tr>
					<td class="title">Stadium:</td>
					<td class="adjusted">${college.stadium}</td>
				</tr>
				<tr>
					<td class="title">Mascot:</td>
					<td class="adjusted">${college.mascot}</td>
				</tr>
				<tr>
					<td class="title">Coach:</td>
					<td class="adjusted">${college.coach}</td>
				</tr>
			</table>
			<br>
		</div>

		<div class="row">
			<div class="col-md-4 col-xs-12">
				<a href="Back.do" id="back">&lt</a>
			</div>

			<div class="col-md-2 col-xs-12">
				<div class="button">
				<form action="edit.jsp" method="POST">
					<button type="submit" class="btn btn-primary" value="${college}">EDIT</button>
				</form>
				</div>
			</div>
			<div class="col-md-2 col-xs-12">
				<div class="button">
				<form action="DeleteCollege.do" method="POST">
					<button type="submit" class="btn btn-primary" name="name" value="${college.name}">DELETE</button>
				</form>
				</div>
			</div>

			<div class="col-md-4 col-xs-12">
				<a href="Next.do" id="next">&gt</a>
			</div>

		</div>

		<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
		<script
			src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	</div>
</body>
</html>