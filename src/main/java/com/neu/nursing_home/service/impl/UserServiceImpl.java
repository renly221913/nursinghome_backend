package com.neu.nursing_home.service.impl;

import com.neu.nursing_home.entity.UserInfo;
import com.neu.nursing_home.mapper.UserInfoMapper;
import com.neu.nursing_home.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * 登录
     * @param userInfo
     * @return
     */
    @Override
    public UserInfo login(UserInfo userInfo){
        UserInfo ui= userInfoMapper.selByUser(userInfo);
        return ui;
    }

}
