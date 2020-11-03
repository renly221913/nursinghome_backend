package com.neu.nursing_home.config;

import com.neu.nursing_home.controller.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    /**
     * 注册拦截器
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor()) //注册哪个拦截器
                .addPathPatterns("/**")
                .excludePathPatterns("/user/login") //不拦截的路径
                .excludePathPatterns("/main/**")
                .excludePathPatterns("/checkin/**")
                .excludePathPatterns("/checkout/**")
                .excludePathPatterns("/outgoing/**");

    }
}
