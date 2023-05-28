package com.example.blog.service;

import com.example.blog.dao.pojo.SysUser;
import com.example.blog.vo.Result;
import com.example.blog.vo.params.LoginParams;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface LoginService {
    //登陆功能
    Result login(LoginParams loginParams);

    SysUser checkToken(String token);

    //退出登陆
    Result logout(String token);

    //注册功能
    Result register(LoginParams loginParams);
}
