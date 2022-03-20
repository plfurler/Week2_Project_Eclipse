<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Week2_Project_Eclipse - ExtraCurricular -
	Registration.jsp</title>
</head>
<body>
<!--
Use Bean Tag Rules
- jsp bean uses XML syntax - must include a slash to close the tag.
- scope controls how long the bean object is available.
	- page: for the current page only -> bean object is stored in pageContent object.
	- request: all components with access to current request object -> bean object is stored in the request object. Thus all components
	with access to the current request object, have access to the bean.
	- session: all components with access to current session object -> bean object is stored as an attribute of the session object. Thus all
	components with access to the current session object have access to the bean.
	- application: all components that have access to the ServletContext object -> bean is stored in the current servlet context object. Thus
	all components that have access to this object have access to the bean.
	
setProperty tag
<jsp:setProperty name="beans id" property="property's name" value="value" />
- the value for the name should match the bean id set in the useBean tag.
- property indicates the property that we want to set.
- value indicates the value we want to set that property to.
- use single quotes around values to avoid the need to use escape sequences.
- the setProperty tag cannot be used to set null values or an empty string. 


	
-->
	<jsp:useBean id="student" scope="session" class="model.Student" />
	<h1>Using a servlet to process simple form parameters</h1>
	<form name="RegForm" action="RegController" method="post">
		<table>
			<thead>
				<tr>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tr>
				<td>Student Id</td>
				<td><input type="text" name="txtId" value="" size="10"></td>
			</tr>
			<tr>
				<td>Full Name</td>
				<td><input type="text" name="txtName" size="30"></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><input type="text" name="txtAddress" size="30"></td>
			</tr>
			<tr>
				<td>Telephone</td>
				<td><input type="text" name="txtTel" size="10"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="txtEmail" size="20"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" name="btnSubmit"></td>
				<td></td>
			</tr>
		</table>
	</form>
	<p>
		Return to <a href="studentservices.html">Home</a>
	</p>
</body>
</html>