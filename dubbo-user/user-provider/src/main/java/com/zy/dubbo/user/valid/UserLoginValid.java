package com.zy.dubbo.user.valid;

import com.zy.dubbo.user.vo.UserLoginRequest;
import org.springframework.util.StringUtils;

/**
 * @author zouyu
 * @description
 * @date 2019/10/25
 */
public class UserLoginValid {
    public  static boolean checkUserLoginRequest(UserLoginRequest request){
        if(StringUtils.isEmpty(request.getUserName())||StringUtils.isEmpty(request.getPassWord())){
            return false;
        }
        return true;
    }
}
