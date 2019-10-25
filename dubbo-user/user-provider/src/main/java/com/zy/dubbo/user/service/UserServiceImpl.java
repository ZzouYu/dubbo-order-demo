package com.zy.dubbo.user.service;

import com.zy.dubbo.user.valid.UserLoginValid;
import com.zy.dubbo.user.vo.Response;
import com.zy.dubbo.user.vo.UserLoginRequest;
import com.zy.dubbo.user.vo.UserLoginResponse;

/**
 * @author zouyu
 * @description
 * @date 2019/10/25
 */
public class UserServiceImpl implements IUserService{
    @Override
    public UserLoginResponse login(UserLoginRequest request) {
        UserLoginResponse rs = new UserLoginResponse();
        if(!UserLoginValid.checkUserLoginRequest(request)){
            rs.setCode("00001");
            rs.setMessage("参数为空，登陆失败");
        }
        rs.setCode("10001");
        rs.setMessage("登录成功");
        return rs;
    }
}
