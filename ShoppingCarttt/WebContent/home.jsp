<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
	font-family: sans-serif;
	font-size: 92.5%;
	line-height: 1;
	color: #414141;
	background: #caccf7;
	padding: 25px 0;
}

div {
	box-sizing: border-box;
}
</style>

<meta charset="ISO-8859-1">
<title>Knowledge On Sale</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<jstl:forEach var="book" items="${sessionScope.books}">
		<div align="center">
			<h3>${book.bookName}</h3>
			<h4>${book.bookDesc}</h4>
			<h3>${book.authorName}</h3>
			<h4>Rs.${book.bookPrice}</h4>
			<img src="image/${book.link}" height="100px" width="100px"> <br>

			<%--returns bookId--%>
			<a href="add.app?bookId=${book.bookId}">Buy</a>
			<hr>
		</div>

	</jstl:forEach>

</body>
</html>