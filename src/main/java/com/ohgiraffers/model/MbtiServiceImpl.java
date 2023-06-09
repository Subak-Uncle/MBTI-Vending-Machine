package com.ohgiraffers.model;

import com.ohgiraffers.dto.UserDto;

public class MbtiServiceImpl implements MbtiService {
    private static final MbtiServiceImpl mbtiService = new MbtiServiceImpl();

    private MbtiServiceImpl() {
    }

    public static MbtiServiceImpl getMbtiService() {
        return mbtiService;
    }

    @Override
    public int login(String userId, String userPw) {
        UserDto.getUserDto().checkId(userId);
        UserDto.getUserDto().checkPw(userPw);
        return 0;
    }
}
