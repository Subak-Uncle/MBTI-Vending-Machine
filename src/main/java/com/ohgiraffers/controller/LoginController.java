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
        RequestDispatcher rd = req.getRequestDispatcher("answer");
        MbtiServiceImpl mbtiService = MbtiServiceImpl.getMbtiService();

        String userId = req.getParameter("userId");
        String userPw = req.getParameter("userPw"); //로그인 입력값 get

        session.setAttribute("userId", mbtiService.login(userId, userPw).getUserId());
        session.setAttribute("userPw", mbtiService.login(userId, userPw).getUserPw());
        userId = (String) session.getAttribute("userId");
        userPw = (String) session.getAttribute("userPw");

        System.out.println("session.getAttribute(\"userId\") = " + userId);
        System.out.println("userPw = " + userPw);

//        if (!session.getAttribute("userId").equals(userId)) {
//            req.setAttribute("error", userId);
//            rd.forward(req, resp);
//        }
//        if (!session.getAttribute("userPw").equals(userPw)) {
//            req.setAttribute("error", userPw);
//            rd.forward(req, resp);
//        } else {
//            User user = MbtiServiceImpl.getMbtiService().login(userId, userPw); //MbtiServiceImpl->DTO 로 전달
//            req.setAttribute("user", user);
//            System.out.println("user = " + user);
//            rd.forward(req, resp);
//        }

        resp.sendRedirect("/question1");

    }
}
