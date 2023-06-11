<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-06-09
  Time: 오후 1:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MBTI 테스트 : Main Home</title>
    <link rel="stylesheet" href="../../css/main.css">
</head>
<body>

<div style="text-align: center; font-size: 30px">
    <h1>MBTI 테스트</h1>
    <h4>당신의 MBTI가 궁금합니다~~~</h4>
    <button id="moveLogin" onclick="moveLogin()">Start</button>
</div>

<script type="text/javascript">
    function moveLogin() {
        location.href = "/loginPage";
    }
</script>
</body>
</html>