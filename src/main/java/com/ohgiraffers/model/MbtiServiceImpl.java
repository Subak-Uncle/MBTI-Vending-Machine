package com.ohgiraffers.model;

import com.ohgiraffers.dto.User;

import java.io.IOException;

public class MbtiServiceImpl implements MbtiService {
    private static final MbtiServiceImpl mbtiService = new MbtiServiceImpl();

    private MbtiServiceImpl() {
    }

    public static MbtiServiceImpl getMbtiService() {
        return mbtiService;
    }

    ////////////// 메소드 //////////////
    @Override
    public User login(String userId, String userPw) throws IOException {
        User user = User.getUser();
        String id = user.checkId(userId);
        String pw = user.checkPw(userPw);
        user.setUserId(id);
        user.setUserPw(pw);
        System.out.println("user ID = " + user.getUserId());
        System.out.println("user PW = " + user.getUserPw());
        return user;
    }
}
