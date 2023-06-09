package com.ohgiraffers.model;

import java.io.IOException;

public class Exception {
    private static Exception exception;

    static {
        try {
            exception = new Exception();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    String[] userArr = ReadFile.getReadfile().readUserDB().split(",");

    private Exception() throws IOException {
    }

    public static Exception getException() throws IOException {
        if (exception == null) {
            exception = new Exception();
        }
        return exception;
    }

    ////////////// 메소드 //////////////
    public String validateUserId(String userId) {
        for (String dbId : userArr) {
            if (userId.equals(dbId.split("/")[0])) {
                return userId;
            }
        }
        throw new IllegalArgumentException("아이디 에러");
    }

    public String validateUserPw(String userPw) {
        for (String dbPw : userArr) {
            if (userPw.equals(dbPw.split("/")[1])) {
                return userPw;
            }
        }
        throw new IllegalArgumentException("비밀번호 에러");
    }

    public String solveIdException(String userId) {
        try {
            return validateUserId(userId);
        } catch (IllegalArgumentException ie) {
            ie.getStackTrace();
            System.out.println(ie.getMessage());
            return ie.getMessage();
        }
    }

    public String solvePwException(String userPw) {
        try {
            return validateUserPw(userPw);
        } catch (IllegalArgumentException ie) {
            ie.getStackTrace();
            return ie.getMessage();
        }
    }
}
