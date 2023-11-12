package com.olive.ms.f_01;

import lombok.Data;

import java.util.Date;

/**
 * @description: User
 * @date: 2023/11/11 15:50
 * @author: olive
 * @version: 1.0
 */
@Data
public class User {
    private Long id;
    private Date gmtCreate;
    private Date createTime;
    private Long buyerId;
    private Long age;
    private String userNick;
    private String userVerified;
}
