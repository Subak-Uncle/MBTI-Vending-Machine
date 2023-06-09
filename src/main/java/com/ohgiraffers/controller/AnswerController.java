package com.ohgiraffers.controller;

import com.ohgiraffers.dto.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/answer")
public class AnswerController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String answer = "I";
        System.out.println(req.getAttribute("error"));

        if (req.getAttribute("error").equals("아이디 에러")) {
            resp.sendError(400, "아이디/비밀번호 에러");
        }
        User user;
        user = (User) req.getAttribute("user");
        String error = (String) req.getAttribute("error");

        System.out.println(user.getUserId());
        System.out.println(user.getUserPw());


        if (error.equals("아이디 에러") || user.equals("비밀번호 에러")) {
            resp.sendError(400, "아이디/비밀번호 에러");
        }
        //getParameter로 입력값 전달 받기
//        else{
//            MbtiDecider mbtiDecider=new MbtiDecider();
//            mbtiDecider.Decider(answer);
//        }

    }
}
