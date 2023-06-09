package com.ohgiraffers.model;

import com.ohgiraffers.dto.UserDto;

public class MbtiServiceImpl implements MbtiService {
    @Override
    public void login(String userId, String userPw) {
        UserDto.getUserDto().checkId(userId);
        UserDto.getUserDto().checkPw(userPw);
    }
}
