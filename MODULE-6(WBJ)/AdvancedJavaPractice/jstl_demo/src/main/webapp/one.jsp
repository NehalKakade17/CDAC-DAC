<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form>
		User Preferences <input type="text" name="prefs" /><br /> <input
			type="submit" value="Test JSTL" name="btn1" />
	</form>
	<c:if test="${param.btn1 eq  'Test JSTL'}">
	<h3>From 1st page.....</h3>
	<c:set var="abc" value="${param.prefs}" scope="session"/>
	<%--Add c:param n check --%>
	<c:url var="url1" value="two.jsp">
		<c:param name="prefs" value="${param.prefs}" />
	</c:url>
		<a href="${url1}">Next</a>
	</c:if>
</body>
</html>