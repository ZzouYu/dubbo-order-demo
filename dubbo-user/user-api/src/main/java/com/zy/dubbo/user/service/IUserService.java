package com.zy.dubbo.user.service;

import com.zy.dubbo.user.vo.UserLoginRequest;
import com.zy.dubbo.user.vo.UserLoginResponse;

public interface IUserService {
    UserLoginResponse login(UserLoginRequest request);
}
