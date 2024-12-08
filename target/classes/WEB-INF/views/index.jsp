<%@ page import="java.util.List" %>
<%@ page import="java.lang.System" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home page</title>
</head>
<body>
    <h1>This is home page</h1>
    <h1>Called by home Controller</h1>
    <h1>url /home</h1>

    <%
        String name = (String) request.getAttribute("name");
        Integer id = (Integer) request.getAttribute("id");
        List<String> friends=(List<String>) request.getAttribute("f");
    %>
    <h1>Name is <%=name%></h1>
    <h1>Id is <%=id%></h1>
    <%
        for (String s:friends){
    %>
    <h1><%=s%></h1>
    <%
        }
    %>
</body>
</html>