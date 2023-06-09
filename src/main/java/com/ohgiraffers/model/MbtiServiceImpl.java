package com.ohgiraffers.model;

import com.ohgiraffers.dto.User;

public class MbtiServiceImpl implements MbtiService {
    private static final MbtiServiceImpl mbtiService = new MbtiServiceImpl();

    private MbtiServiceImpl() {
    }

    public static MbtiServiceImpl getMbtiService() {
        return mbtiService;
    }

    ////////////// 메소드 //////////////
    @Override
    public User login(String userId, String userPw) {
        User user = User.getUser();
        String id = User.getUser().checkId(userId);
        String pw = User.getUser().checkPw(userPw);
        user.setUserId("admin1");
        user.setUserPw("admin1");

        System.out.println("id = " + id);
        System.out.println("pw = " + pw);
        System.out.println("user ID = " + user.getUserId());
        System.out.println("user PW = " + user.getUserPw());
        return user;
    }
}
