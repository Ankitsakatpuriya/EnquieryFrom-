<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Website Enquiry Form</h1>
	<form:form action ="submitQueries.do" modelAttribute="UsersQueries" method ="post">
	<table>
			<tr>
				<td>Name:</td>
				<td>
					<form:input path="name" id="name"/>
					 <td style="color: red; font-style: italic;"><form:errors path="name" />
					</td>
					
			</tr>
			<tr>
				<td>Contact Number:</td>
				<td>
				<form:input path="contactNumber" id="contactNumber" />
				<td style="color: red; font-style: italic;"><form:errors path="contactNumber" />
				</td>
			</tr>
			<tr>
				<td>Email:</td>
				<td>
				<form:input path="email" id="email" />
				<td style="color: red; font-style: italic;"><form:errors path="email" />
				</td>
			</tr>
			<tr>
				<td>Profession:</td>
				<td><form:select path="profession">
						<form:option value="" label="Select Role" />
						<form:option value="BCA" label="BCA" />
						<form:option value="BE" label="BE" />
						<form:option value="BCA" label="BCA" />
						<form:option value="MCA" label="MCA" />
						<form:option value="BCom" label="BCom" />
					</form:select>
					<td style="color: red; font-style: italic;"><form:errors path="profession" />
					</td>
			</tr>
			<tr>
				<td>Comment:</td>
				<td><form:textarea path="comment" rows="3" cols="20"/>
				<td style="color: red; font-style: italic;"><form:errors path="comment" />
				</td>
			</tr>
			<tr>
				<td>send me promotional information:</td>
				<td>
					Newspaper <form:checkbox path="promotional_Information" value="Newspaper"/>
					Newschannel <form:checkbox path="promotional_Information" value="Newschannel"/>
					Social Media <form:checkbox path="promotional_Information" value="Social Media"/>
				<td style="color: red; font-style: italic;"><form:errors path="promotional_Information" />
				</td>
			</tr>
			<tr>
			<td>
				<input type="submit" name="action" value="Submit" /> 
				<button type="reset" value="Reset">Reset</button>
			
			</td></tr>
	</table>
	</form:form>
	
</body>
</html>