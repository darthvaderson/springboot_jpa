package com.koscom.springboot.domain.user;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

    GUEST("ROLE_GUEST", "손님"),
    USER("ROLE_USER", "일반 사용자");

    private final String key;
    private final String title;


//    public String goodBye() {
//        Role.GUEST.goodBye();
//        Role.USER.goodBye();
//
//        return title + "안녕히가세요";
//    }
}
