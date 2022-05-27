package com.example.blog.service;

import com.example.blog.dao.pojo.SysUser;

public interface SysUserService {
    SysUser findUserById(Long id);

    SysUser fingUser(String account, String password);
}
