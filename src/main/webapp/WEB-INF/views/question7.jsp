<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-06-09
  Time: 오후 1:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>MBTI 테스트 : "결정내리기" question</title>
</head>
<body>
<form action="answer" method="get">
    <h1>질문 7</h1>

    <label>Q7. </label><h4>감정보다는 이성을 따르는 편이다.</h4>
    <br>
    <br>
    <input type="radio" name="answer" id="answer1" value="T"><label for="answer1">YES</label>
    &nbsp&nbsp&nbsp&nbsp
    <input type="radio" name="answer" id="answer2" value="F"><label for="answer2">No</label>
    <br>
    <input type="submit" value="NEXT">
</form>
</body>
</html>
