

<%@ page import="java.time.LocalDateTime" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
    <title>This is help page</title>
</head>
<body>

<%
//    String name = (String) request.getAttribute("name");
//    Integer id = (Integer) request.getAttribute("id");
//    String son = (String) request.getAttribute("son");
//    LocalDateTime time = (LocalDateTime) request.getAttribute("time");
%>

<h1>Hello</h1>
<h1>This is help page </h1>
<h1>This is my name ${name} </h1>
<h1>My id is ${id} </h1>
<h1>I'm The Elder One ${son}  </h1>
<h1>The Date and Time is ${time} </h1>
<hr>
<h1>Marks are <c:forEach var="item" items="${marks}">
    <h1>
        ${item}
    </h1>
</c:forEach></h1>
</body>
</html>
