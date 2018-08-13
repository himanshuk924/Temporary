<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center"
		style="padding-bottom: inherit; padding-top: inherit; font-family: cursive;background-color: white;">
		<a href="index.jsp">Amazon Books</a>
	</h1>
	<div align="right">
		<h5>
			<%--CART AND OBJECTS IN CART--%>
			<a href="view.app"><button>Cart
					${sessionScope.cart.size()}</button></a>
		</h5>
	</div>
</body>
</html>