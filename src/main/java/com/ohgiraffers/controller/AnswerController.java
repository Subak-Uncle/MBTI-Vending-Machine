package com.ohgiraffers.controller;

import com.ohgiraffers.model.MbtiDecider;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.beans.PropertyEditorSupport;
import java.io.IOException;
import java.util.Date;

@WebServlet("/answer")
public class AnswerController extends HttpServlet {
    private int questionIndex = 1;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("AnswerController doGet : " + new Date());

        RequestDispatcher rd;
        MbtiDecider mbtiDecider = new MbtiDecider();
        String answer = req.getParameter("answer");
        String prev = req.getParameter("prev");
        System.out.println("prev = " + prev);

        if (prev.equals("prev")){
            questionIndex--;

            rd = req.getRequestDispatcher("/WEB-INF/views/question" + questionIndex + ".jsp");

        } else {
            System.out.println("Q." + questionIndex + " answer = " + answer);

            mbtiDecider.decider(questionIndex, answer);
            questionIndex++;

            if (questionIndex >= 13) {
                String result = mbtiDecider.MBTIDecider();
                req.setAttribute("result", result);
                rd = req.getRequestDispatcher("/WEB-INF/views/result.jsp");
                System.out.println("result = " + result);
            } else {
                rd = req.getRequestDispatcher("/WEB-INF/views/question" + questionIndex + ".jsp");
            }
        }

        rd.forward(req, resp);

    }
}