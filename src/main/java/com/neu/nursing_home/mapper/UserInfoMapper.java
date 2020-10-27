package com.neu.nursing_home.mapper;

import com.neu.nursing_home.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component(value = "UserInfoMapper")
public interface UserInfoMapper {
    UserInfo selByUser(UserInfo userInfo);
}
