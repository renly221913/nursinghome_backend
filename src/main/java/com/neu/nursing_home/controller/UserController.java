package com.neu.nursing_home.controller;

import com.neu.nursing_home.entity.UserInfo;
import com.neu.nursing_home.service.UserService;
import com.neu.nursing_home.util.JwtUtil;
import com.neu.nursing_home.vo.ResultVO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("login")
    public ResultVO<UserInfo> login(@RequestBody UserInfo userInfo){
        UserInfo ui = userService.login(userInfo);
        ResultVO<UserInfo> resultVO = new ResultVO();
        if(ui != null){//登录成功
            //用JWT验证Token
            String token = JwtUtil.sign(ui.getUname());
            System.out.println(token);
            resultVO.setMessage(token);
            resultVO.setObject(ui);
            resultVO.setState(200);
        }else{//登录失败
            resultVO.setState(500);
        }
        return resultVO;
    }
}
