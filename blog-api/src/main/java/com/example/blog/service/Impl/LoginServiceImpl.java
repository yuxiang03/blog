package com.example.blog.service.Impl;

import com.alibaba.fastjson.JSON;
import com.example.blog.dao.pojo.SysUser;
import com.example.blog.service.LoginService;
import com.example.blog.utils.JWTUtils;
import com.example.blog.vo.ErrorCode;
import com.example.blog.vo.Result;
import com.example.blog.vo.params.LoginParams;
import io.netty.util.internal.StringUtil;
import org.apache.commons.lang3.StringUtils;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private SysUserServiceImpl sysUserService;
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    private static final String SALT = "$2a$10$Nsf/5GOl9JZtbpWHjykN/4";

    /*
    1.检查参数是否合法
    2.根据用户名和密钥去user表中查询是否存在
    3.如果不存在则登陆失败
    4,如果存在使用jwt生成token返回前端
    5.token放入Redis当中，redis token user信息 设置过期时间
    （登陆认证的时候 先认证token字符串是否合法 去redis认真是否存在）
     */
    @Override
    public Result login(LoginParams loginParams) {
        String account = loginParams.getAccount();
        String password = loginParams.getPassword();
        if (StringUtils.isBlank(account) || StringUtils.isBlank(password)){
            return Result.fail(ErrorCode.PARAMS_ERROR.getCode(),ErrorCode.PARAMS_ERROR.getMsg());
        }

        String BCryptPassword = BCrypt.hashpw(password,SALT);
        SysUser sysUser = sysUserService.fingUser(account,BCryptPassword);
        if (sysUser == null) {
            return Result.fail(ErrorCode.PARAMS_ERROR.getCode(),ErrorCode.PARAMS_ERROR.getMsg());
        }
        String token = JWTUtils.createToken(sysUser.getId());
        redisTemplate.opsForValue().set("TOKEN_"+token, JSON.toJSONString(sysUser),100, TimeUnit.DAYS);
        return Result.success(token);
    }
}
