<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>twitter CreateUser</title>
</head>
<body>
<p>Hello twitter CreateUser !!!</p>
<form action="user" method="post">
User Name: <input name="userName"/></br>
First Name: <input name="firstName"/></br>
Last Name: <input name="lastName"/></br>
Tweet: 
<select name="tweetKey">
	<c:forEach var="e" items="${tweetList }">
		<option value="${e.key.id}">${e.content }</option>
	</c:forEach>
</select>
<input type="submit" value="Create"/>
</form>
</body>
</html>
