package com.olive.ms.f_01;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @description: UserPo
 * @date: 2023/11/11 15:48
 * @author: olive
 * @version: 1.0
 */
@Data
@Builder
public class UserPo {
    private Long id;
    private Date gmtCreate;
    private Date createTime;
    private Long buyerId;
    private Long age;
    private String userNick;
    private String userVerified;
}
