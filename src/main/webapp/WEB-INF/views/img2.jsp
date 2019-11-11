<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Image-form</title>
</head>
<body>


	<form:form method="POST" modelAttribute="sone"
		enctype="multipart/form-data" action="addproduct">

	First Name<form:input path="firstname" />

	Last Name <form:input path="lastname" />

		<input type="file" name="file" />

		<input type="submit" value="Upload" />


	</form:form>

</body>
</html>