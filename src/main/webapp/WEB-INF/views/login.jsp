<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-06-09
  Time: 오후 1:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MBTI 테스트 : Login</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    <link rel="stylesheet" href="../../css/login.css">
</head>
<body>

<div class="container">
    <div class="welcome">
        <div class="pinkbox">

            <%-- 설명. 회원가입 --%>
            <div class="signup nodisplay">
                <h1>register</h1>
                <form action="register" autocomplete="off">
                    <input type="text" placeholder="username">
                    <input type="email" placeholder="email">
                    <input type="password" placeholder="password">
                    <input type="password" placeholder="confirm password">
                    <button class="button submit">create account</button>
                </form>
            </div>

            <%-- 설명. 로그인--%>
            <div class="signin">
                <h1>sign in</h1>
                <form action="login" class="more-padding" autocomplete="off" method="post">
                    <input type="text" name="userId" class="hangleFont" placeholder="아이디">
                    <input type="password" name="userPw" class="hangleFont" placeholder="패스워드">
                    <div class="checkbox">
                        <input type="checkbox" id="remember"/><label for="remember">remember me</label>
                    </div>

                    <button class="button submit">login</button>
                </form>
            </div>
        </div>

        <%-- 설명. 회원가입 창에서 왼쪽 박스--%>
        <div class="leftbox">
            <h2 class="title"><span>BLOOM</span>&<br>BOUQUET</h2>
            <p class="desc">pick your perfect <span>bouquet</span></p>
            <img class="flower smaller" src="https://image.ibb.co/d5X6pn/1357d638624297b.jpg" alt="1357d638624297b"
                 border="0">
            <p class="account">have an account?</p>
            <button class="button" id="signin">login</button>
        </div>

        <%-- 설명. 로그인 창에서 오른쪽 박스 --%>
        <div class="rightbox">
            <h2 class="title"><span>MBTI Test</span></h2>
            <p class="desc"> Journey into <span>Mind's Blueprint</span></p>
            <img class="flower" src="https://preview.ibb.co/jvu2Un/0057c1c1bab51a0.jpg"/>
            <p class="account">don't have an account?</p>
            <button class="button" id="signup">sign up</button>
        </div>
    </div>
</div>

<script type="text/javascript">
    $(function () {
        $('#signup').click(function () {
            $('.pinkbox').css('transform', 'translateX(80%)');
            $('.signin').addClass('nodisplay');
            $('.signup').removeClass('nodisplay');
        });

        $('#signin').click(function () {
            $('.pinkbox').css('transform', 'translateX(0%)');
            $('.signup').addClass('nodisplay');
            $('.signin').removeClass('nodisplay');
        });

    });


    function moveQuestion() {
        location.href = "/question1";
    }
</script>


</body>
</html>
