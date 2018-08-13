<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>window.history.forward(1)</script>
</head>
<body style="background: linear-gradient(white, blue);">
	<jsp:include page="header.jsp"></jsp:include>
	<div align="center">
		<h1>Sign in</h1>
		<form action="login.app" method="get">
			<table>
				<tr>
					<td>User Name</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password"></td>
				</tr>
			</table>
			<input type="submit" value="Submit">
		</form>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>