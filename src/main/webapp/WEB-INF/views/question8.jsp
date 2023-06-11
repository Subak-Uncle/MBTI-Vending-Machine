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
    <title>MBTI 테스트 : "결정내리기" question</title>
    <link rel="stylesheet" href="../../css/main.css">
</head>
<body>
<form action="answer" onsubmit="checkForm(event)">
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
                    <h2>Q8. 다른 사람의 감정을 이해하기 힘들 때가 많다.</h2>
                </th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td colspan="2" style="text-align: center">
                    <input type="radio" id="answer1" name="answer" value="T"><label for="answer1">YES</label>
                </td>
                <td colspan="2" style="text-align: center">
                    <input type="radio" id="answer2" name="answer" value="F"><label for="answer2">No</label>
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

<script type="text/javascript">
    function checkForm(event) {
        let selectedOption = document.querySelector('input[name="answer"]:checked')
        if (selectedOption === null) {
            event.preventDefault();
            alert("하나 이상의 선택지를 선택해주세요.");
            location.reload();
        }
    }
</script>
</body>
</html>
