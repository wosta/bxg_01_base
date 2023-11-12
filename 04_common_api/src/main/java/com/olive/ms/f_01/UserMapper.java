package com.olive.ms.f_01;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @description: UserMapper
 * @date: 2023/11/11 15:51
 * @author: olive
 * @version: 1.0
 */
@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User po2User(UserPo po);
}
