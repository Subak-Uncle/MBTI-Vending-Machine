package com.ohgiraffers.controller;

import com.ohgiraffers.dto.User;
import com.ohgiraffers.model.MbtiDecider;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/answer")
public class AnswerController extends HttpServlet {
    private int questionIndex = 1;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher rd;
        MbtiDecider mbtiDecider=new MbtiDecider();
        String answer=req.getParameter("answer");

        System.out.println(answer);

        mbtiDecider.Decider(answer);
        questionIndex++;

        System.out.println(questionIndex);

        if(questionIndex==13){
            rd=req.getRequestDispatcher("/WEB-INF/views/result.jsp");
            rd.forward(req,resp);
        }
        else{
            rd=req.getRequestDispatcher("/WEB-INF/views/question"+questionIndex+".jsp");
        }

        rd.forward(req,resp);

    }
}