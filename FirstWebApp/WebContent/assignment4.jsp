<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<%@ taglib uri="/WEB-INF/c.tld" prefix="d"%>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="cdac" method="post">
		<input type="text" name="name1" /> <input type="text" name="name2" />

		<input type="submit" value="getall" name="why" /> <input type="submit"
			value="update" name="why" />
	</form>
	<d:forEach var="i" items="${k1}">
		<d:out value="${i.id}" /> -- 
		<d:out value="${i.price}" /> -- 
		<d:out value="${i.quantity}" /> <BR/>
	</d:forEach>

</body>
</html>