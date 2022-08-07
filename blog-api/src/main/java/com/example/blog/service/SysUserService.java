package com.example.blog.service;

import com.example.blog.dao.pojo.SysUser;
import com.example.blog.vo.Result;
import com.example.blog.vo.UserVo;

public interface SysUserService {
    UserVo findUserVoById(Long id);

    SysUser findUserById(Long id);

    SysUser fingUser(String account, String password);

    //根据token查询用户信息
    Result findUserByToken(String token);

    //根据用户查找账户
    SysUser findUserByAccount(String account);

    //保存用户
    void save(SysUser sysUser);
}
