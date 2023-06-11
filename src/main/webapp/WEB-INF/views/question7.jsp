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
<form id="myForm" action="answer">
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
                    <h2>Q7. 감정보다는 이성을 따르는 편이다.</h2>
                </th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td colspan="2" style="text-align: center">
                    <input type="radio" id="answer1" name="answer" value="T" required checked><label for="answer1">YES</label>
                </td>
                <td colspan="2" style="text-align: center">
                    <input type="radio" id="answer2" name="answer" value="F" required><label for="answer2">No</label>
                </td>
            </tr>
            <tr>
                <td colspan="2" style="text-align: left; padding-left: 10px">
                    <input type="hidden" id="prev" name="prev" value="">
                    <button type="button" onclick="submitPrev()">Prev</button>
                </td>
                <td colspan="2" style="text-align: right; padding-right: 10px">
                    <button type="submit">Next</button>
                </td>
            </tr>
            </tbody>
        </table>
    </div>
</form>
<script type="text/javascript">
    function submitPrev() {
        document.getElementById("prev").value = "prev";
        document.getElementById('myForm').submit();
    }
</script>
</body>
</html>
