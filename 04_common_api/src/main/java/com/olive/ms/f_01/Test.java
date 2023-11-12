package com.olive.ms.f_01;

import java.util.Date;

/**
 * @description: Test
 * @date: 2023/11/11 15:47
 * @author: olive
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        testNormal();
    }

    public static void testNormal() {
        System.out.println("-----------testNormal-----start------");
        UserPo userPo = UserPo.builder()
                .id(1L)
                .gmtCreate(new Date())
                .buyerId(666L)
                .userNick("测试mapstruct")
                .userVerified("ok")
                .age(18L)
                .build();
        System.out.println("1234" + userPo);
        User userEntity = UserMapper.INSTANCE.po2User(userPo);
        System.out.println(userEntity);
        System.out.println("-----------testNormal-----ent------");
    }

}
