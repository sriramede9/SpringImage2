<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>form to upload image</title>
</head>
<body>

	<form:form method="post" modelAttribute="sone" action="resp" enctype="multipart/form-data">
		<table>
			<tr>
				<td>First Name:</td>
				<td><form:input path="firstname" /></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><form:input path="lastname" /></td>
			</tr>
			 <tr>
            <td>Select a file to upload</td>
            <td><input type="file" name="file" /></td>
        </tr>
        <tr>
			<tr>
				<td colspan="2"><input type="submit" value="Save Changes" /></td>
			</tr>
			
		</table>
	</form:form>

</body>
</html>