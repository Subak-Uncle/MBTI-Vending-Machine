package com.ohgiraffers.controller;

import com.ohgiraffers.model.MbtiServiceImpl;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebServlet("/login")
public class LoginController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        MbtiServiceImpl mbtiService = MbtiServiceImpl.getMbtiService();

        String userId = req.getParameter("userId");
        String userPw = req.getParameter("userPw"); //로그인 입력값 get

        session.setAttribute("userId", mbtiService.login(userId, userPw).getUserId());
        session.setAttribute("userPw", mbtiService.login(userId, userPw).getUserPw());
//        userId = (String) session.getAttribute("userId");
//        userPw = (String) session.getAttribute("userPw");

        if (session.getAttribute("userId").equals("아이디 에러")||
                session.getAttribute("userPw").equals("비밀번호 에러")) {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "아이디/비밀번호 에러");

        }
        else{
            resp.sendRedirect("/question1");
        }

    }
}
