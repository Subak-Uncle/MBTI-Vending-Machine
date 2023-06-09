package com.ohgiraffers.dto;

public class UserDto {
    private static UserDto userDto;
    private String userId;
    private String userPw;

    private UserDto() {
    }

    public UserDto(String userId, String userPw) {
        this.userId = userId;
        this.userPw = userPw;
    }

    public static UserDto getUserDto() {
        if (userDto == null) {
            userDto = new UserDto();
        }
        return userDto;
    }

    public void checkId(String userId) {

    }

    public void checkPw(String userPw) {

    }
}
