<%@ page import="com.cg.modelresume.ResumeModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%
	ResumeModel resume = (ResumeModel) request.getAttribute("values");
%>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	background-color: green;
}

.resume1 {
	padding: 50px;
	background-color: white;
	margin-left: 20%;
	margin-right: 20%;
	font-family: fantasy;
}

.details {
	font-size: small;
	font-family: sans-serif;
}

h3 {
	text-align: center;
}
</style>
</head>
<body>
	<div class="resume1">
		<h2><%=resume.getFirstName()%>
			<%=resume.getLastName()%></h2>
		<div class="details"><%=resume.getAddress()%></div>
		<div class="details"><%=resume.getGender()%></div>
		<div class="details"><%=resume.getDOB()%></div>
		<div class="details"><%=resume.getEmail()%></div>
		<div class="details"><%=resume.getWebsite()%></div>
		<h3>Summary</h3>
		<p><%=resume.getSummary()%></p>
		<hr>
		<h3>Highest Qualification</h3>
		<p><%=resume.getHighQualification()%></p>
		<hr>
		<h3>Skills</h3>
		<%
			String skill[] = resume.getSkills();
			for (String ski : skill)
				out.println("<li>" + ski + "</li>");
		%>
		<hr>
		<h3>Hobbies</h3>
		<%
			String hobb[] = resume.getHobbies();
			for (String hob : hobb)
				out.println("<li>" + hob + "</li>");
		%>
	</div>
</body>
</html>