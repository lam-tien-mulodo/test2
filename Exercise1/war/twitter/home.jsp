<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>twitter Index</title>
</head>
<body>
	<p>Hello</p>
	<form action="tweet" method="post">
		Content: <br/>
		<textarea rows="" cols="" name="content"></textarea><br/>
		<input type="submit" value="Create"/>
	</form>
	<table>
	
		<c:forEach var="e" items="${tweetList }">
			<tr>
				<td>${f:h(e.content)}</td>
			</tr>
		</c:forEach>
		
	</table>

</body>
</html>
