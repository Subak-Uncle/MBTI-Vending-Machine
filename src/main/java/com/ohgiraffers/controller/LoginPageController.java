package com.ohgiraffers.controller;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Date;


@WebServlet("/loginPage")
public class LoginPageController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("LoginPageController doGet : " + new Date());

        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/login.jsp");
        rd.forward(req, resp);
    }
}


