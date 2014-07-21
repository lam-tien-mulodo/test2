<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updateUser" method="post">
<%-- <input type="hidden" name="key" value="${key }"/> --%>
<input type="hidden" ${f:hidden("key")}/>
User Name: <input name="userName" value="${userName }"/></br>
First Name: <input name="firstName" value="${firstName }"/></br>
Last Name: <input name="lastName" value="${lastName }"/></br>
<select name="tweetKey">
 
	<c:forEach var="e" items="${tweetList }">
		 <c:choose>
			 <c:when test="${tweetRef.key == e.key}">
				<option value="${e.key.id}" selected="selected">${e.content }</option>
			</c:when>
			<c:otherwise>
				<option value="${e.key.id}">${e.content }</option>
			</c:otherwise>
		</c:choose>
	</c:forEach>
</select>
<input type="submit" value="Update"/>
</form>
</body>
</html>