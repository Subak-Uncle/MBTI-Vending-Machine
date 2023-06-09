package com.ohgiraffers.model;

public class Exception {
    private static Exception exception = new Exception();

    private Exception() {
    }

    public static Exception getException() {
        if (exception == null) {
            exception = new Exception();
        }
        return exception;
    }

    ////////////// 메소드 //////////////
    public void validateUserId(String userId) {
        if (userId.equals("")) {
            throw new IllegalArgumentException("");
        }
    }

    public void validateUserPw(String userPw) {
        if (userPw.equals("")) {
            throw new IllegalArgumentException("");
        }
    }

    public String solveIdException(String userId) {
        try {
            validateUserId(userId);
            return userId;
        } catch (IllegalArgumentException ie) {
            ie.getStackTrace();
            return ie.getMessage();
        }
    }

    public String solvePwException(String userPw) {
        try {
            validateUserPw(userPw);
            return userPw;
        } catch (IllegalArgumentException ie) {
            ie.getStackTrace();
            return ie.getMessage();
        }
    }
}
