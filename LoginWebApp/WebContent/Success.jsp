<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>window.history.forward(1)</script>
</head>
<body style="background: linear-gradient(white, blue);>

	<div align="center">
		<jsp:include page="header.jsp"></jsp:include>
		<div align="right">
			<a href="logout.app">Log Out</a>
		</div>
		<div align="center">
			<jstl:if test="${sessionScope.username!=null}">
				<h4>Hello ${sessionScope.username}</h4>
			</jstl:if>
			<jstl:if test="${sessionScope.username==null}">
				 <jstl:redirect url="login.jsp"></jstl:redirect>
			</jstl:if>
		</div>
		<jsp:include page="footer.jsp"></jsp:include>
	</div>
</body>
</html>