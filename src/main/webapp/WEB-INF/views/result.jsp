<%@ page import="java.nio.file.FileStore" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-06-09
  Time: 오후 2:40
  To change this template use File | Settings | File Templates.
--%>
<%
    String result = (String) request.getAttribute("result");
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MBTI 테스트 : 결과</title>
    <link rel="stylesheet" href="../../css/main.css">
</head>
<body>
      <h1> 당신의 MBTI는 <span style="color: #fee03b; font-size: 50px"><%=result%></span> 입니다.</h1>
</body>
</html>
