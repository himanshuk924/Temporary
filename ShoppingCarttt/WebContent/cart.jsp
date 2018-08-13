<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cart</title>
<style type="text/css">
body {
	font-family: sans-serif;
	font-size: 92.5%;
	line-height: 1;
	color: #414141;
	background: #caccf7;
	padding: 25px 0;
}
</style>
</head>
<body>
<jsp:include page="header.jsp" ></jsp:include> 

<%--when cart is not empty --%>
<jstl:if test="${sessionScope.cart.size()>0 }">

<%--initialize variable total for total amount--%>
<jstl:set var="total" value="0"/>

<%--to iterate --%>
<jstl:forEach var="books" items="${sessionScope.cart}">
	
			<div align="center" >
			 <h3>${books.bookName}</h3>		
			<img src="image/${books.link}" height="100px" width="100px">
			<h4>${books.authorName}</h4>
			<h4>bookCount=${books.bookcount}</h4>
			<h4 style="color:green">Rs. ${books.bookPrice*books.bookcount}</h4>
			
			<%--Remove from Cart--%>
			<a href="remove.app?bookId=${books.bookId}">Remove</a> 
			
			<%--total price--%>
			<jstl:set var="total" value="${total+books.bookPrice*books.bookcount}"/>
			<hr>
			</div>		
		</jstl:forEach>
		
		<h3 style="color:green">${total}</h3>
</jstl:if>

<%--to print empty--%>
<jstl:if test="${sessionScope.cart.size()<=0 }">
<h1 align="center">Empty Cart</h1>

</jstl:if>
</body>
</html>