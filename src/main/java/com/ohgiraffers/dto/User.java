package com.ohgiraffers.dto;

import com.ohgiraffers.model.Exception;

public class User {
    private static User user; //싱글톤 패턴
    ////////////// 메소드 //////////////
    Exception exception = Exception.getException();
    private String userId;
    private String userPw;

    private User() {
    }

    public static User getUser() {
        if (user == null) {
            user = new User();
        }
        return user;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    // 아이디 검증
    public String checkId(String userId) {
        if (exception.solveIdException(userId).equals("")) {
            return userId;
        }
        return "error";
    }

    // 비밀번호 검증
    public String checkPw(String userPw) {
        if (exception.solvePwException(userPw).equals("")) {
            return userPw;
        }
        return "error";
    }
}
