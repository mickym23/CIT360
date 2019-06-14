<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Final Student Details</title>
</head>
<body>

<!-- 
		This is the first JSP file.
		The final details are shown to the user. 
		If the user is happy with it, they can submit
		the details which will send them to the next 
		JSP file (redirect.jsp). 
 -->
 
	<h1>Final Details</h1>
	<%= "First Name of Current Student: " + session.getAttribute("fname") %><br><br>
	<%= "Last Name of Current Student: " + session.getAttribute("lname") %><br><br>
	<%= "Physical Address: " + session.getAttribute("address") %><br><br>
	<%= "Email Address: " + session.getAttribute("email") %><br><br>
	<%= "Contact Number: " + session.getAttribute("number") %><br><br>
	<%= "Date of Birth: " + session.getAttribute("dob") %><br><br>
	<%= "BYUI I-Number: #" + session.getAttribute("inum") %><br><br>
	<%= "Course Enrolled: " + session.getAttribute("course") %><br><br>
	<%= "BYUI Username: " + session.getAttribute("username") %><br><br>
	<%= "BYUI Password: " + session.getAttribute("password") %><br><br>

	<!-- This form tag sends the user to the next JSP file -->
	<form action = "redirect.jsp">
	<input type = "submit" value = "Submit">
	</form>
	
</body>
</html>