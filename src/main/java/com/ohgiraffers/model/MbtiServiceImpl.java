package com.ohgiraffers.model;

import com.ohgiraffers.dto.UserDto;

public class MbtiServiceImpl implements MbtiService {
    private static MbtiServiceImpl mbtiService = new MbtiServiceImpl();

    private MbtiServiceImpl() {
    }

    public static void getMbtiService(MbtiServiceImpl mbtiService) {
        MbtiServiceImpl.mbtiService = mbtiService;
    }

    @Override
    public void login(String userId, String userPw) {
        UserDto.getUserDto().checkId(userId);
        UserDto.getUserDto().checkPw(userPw);
    }
}
