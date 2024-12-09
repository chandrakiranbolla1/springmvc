
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
  <head>
    <title>sucess</title>
  </head>
  <body>
  <h1>This shows that the reposnse is sent to backend!</h1>
  <h1>${Header }</h1>
  <h1>${Desc }</h1>
  <hr>
  <h1>Welcome, ${user.userName }</h1>
  <h1>Your Email is , ${user.email }</h1>
  <h1>Your password is safe, ${user.password }</h1>

  </body>
</html>
