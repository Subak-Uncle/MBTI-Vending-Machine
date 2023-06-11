package com.ohgiraffers.controller;

import com.ohgiraffers.model.MbtiDecider;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/result")
public class ResultController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        MbtiDecider mbtiDecider=new MbtiDecider();
        String result=mbtiDecider.MBTIDecider();

        req.setAttribute("result",result);
        RequestDispatcher rd= req.getRequestDispatcher("/WEB-INF/views/result.jsp");
        rd.forward(req,resp);

    }
}
