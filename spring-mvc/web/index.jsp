<%--
  Created by IntelliJ IDEA.
  User: sea
  Date: 22-1-5
  Time: 下午2:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1><a href="${pageContext.request.contextPath}/user/goLogin">登录页面</a></h1>
  <h1><a href="${pageContext.request.contextPath}/user/main">首页</a></h1>


      <form action="${pageContext.request.contextPath}/upload" enctype="multipart/form-data" method="post">
     　 <input type="file" name="file">
        <input type="submit" value="提交">
      </form>

  <a href="${pageContext.request.contextPath}/download">下载</a>
  </body>
</html>
