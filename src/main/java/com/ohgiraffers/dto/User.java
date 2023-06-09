package com.ohgiraffers.dto;

import com.ohgiraffers.model.Exception;

import java.io.IOException;

public class User {
    private static User user;
    Exception exception = Exception.getException();
    private String userId;
    private String userPw;

    private User() throws IOException {
    }

    public static User getUser() throws IOException {
        if (user == null) {
            user = new User();
        }
        return user;
    }

    ////////////// 메소드 //////////////
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
        return exception.solveIdException(userId);
    }

    // 비밀번호 검증
    public String checkPw(String userPw) {
        return exception.solvePwException(userPw);
    }
}
