package com.ohgiraffers.controller;

import com.ohgiraffers.model.MbtiDecider;
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
        mbtiDecider.MBTIDecider("admin"); //최종 결과값 받아오기

//        view로 이동 result 출력



    }
}
