<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-06-09
  Time: 오후 1:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MBTI 테스트 : "정보 수집" question</title>
    <link rel="stylesheet" href="../../css/main.css">
</head>
<body>
<form action="answer">
    <div id="questionBox">
        <table>
            <colgroup>
                <col style="width: 200px">
                <col style="width: 200px">
                <col style="width: 200px">
                <col style="width: 200px">
            </colgroup>
            <thead>
            <tr>
                <th colspan="4">
                    <h2>Q4. 요리할 때 재료의 정량을 신경쓰지 않는다</h2>
                </th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td colspan="2" style="text-align: center">
                    <input type="radio" id="answer1" name="answer" value="N" required><label for="answer1">YES</label>
                </td>
                <td colspan="2" style="text-align: center">
                    <input type="radio" id="answer2" name="answer" value="S" required><label for="answer2">No</label>
                </td>
            </tr>
            <tr>
                <td colspan="4" style="text-align: right">
                    <button type="submit">Next</button>
                </td>
            </tr>
            </tbody>
        </table>
    </div>
</form>
</body>
</html>
