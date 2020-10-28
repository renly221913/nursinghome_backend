package com.neu.nursing_home.controller;

import com.neu.nursing_home.util.JwtUtil;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 拦截器
 */
public class MyInterceptor implements HandlerInterceptor {

    /**
     * 调用Controller方法之前触发
     *
     * @param request
     * @param response
     * @param handler
     * @return true:正常访问,false:不让访问
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        boolean flag = false;
        System.out.println("进拦截器");
        //取请求头中的token
        String token = request.getHeader("Authorization");
        System.out.println(token);
        if (token != null) {
            //校验Token
            flag = JwtUtil.verify(token);
        }
        return flag;
    }
}
