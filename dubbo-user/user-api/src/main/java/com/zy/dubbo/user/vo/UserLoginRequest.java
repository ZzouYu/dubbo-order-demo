package com.zy.dubbo.user.vo;

import java.io.Serializable;

/**
 * @author zouyu
 * @description
 * @date 2019/10/25
 */
public class UserLoginRequest implements Serializable {
    private static final long serialVersionUID = 6816099197648059787L;
    private String userName;
    private String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "UserLoginRequest{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
