<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c"%>
     <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var = "age" value="${19}" scope="session"></c:set>

<c:out value ="${age}"/>
<c:if test="${age>18}">
<c:out value="age is valid"></c:out>
</c:if>
</body>
</html>