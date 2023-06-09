package com.ohgiraffers.controller;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet("/pages/*")
public class MainController extends HttpServlet {

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String path = req.getPathInfo();    // "/pages/"
        System.out.println("path = " + path);
        RequestDispatcher rd = null;

        if ("/mainHome".equals(path)){
            rd = req.getRequestDispatcher("/WEB-INF/views/mainHome.jsp");
        }
        if ("/loginPage".equals(path)) {
            rd = req.getRequestDispatcher("/WEB-INF/views/login.jsp");
        }
        if ("/question".equals(path)){
            rd = req.getRequestDispatcher("/WEB-INF/views/question1.jsp");
        }

        rd.forward(req, resp);
    }
}


