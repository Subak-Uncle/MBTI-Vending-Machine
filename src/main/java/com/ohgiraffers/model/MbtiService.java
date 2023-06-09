package com.ohgiraffers.model;

import com.ohgiraffers.dto.User;

public interface MbtiService {
    User login(String userId, String userPw);
}
