package com.example.blog.service;

import com.example.blog.vo.Result;
import com.example.blog.vo.params.LoginParams;

public interface LoginService {
    //登陆功能
    Result login(LoginParams loginParams);
}
