package com.ohgiraffers.model;

import com.ohgiraffers.dto.User;

import java.io.IOException;

public interface MbtiService {
    User login(String userId, String userPw) throws IOException;
}
