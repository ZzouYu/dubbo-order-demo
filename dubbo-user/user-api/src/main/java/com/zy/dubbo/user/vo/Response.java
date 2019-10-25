package com.zy.dubbo.user.vo;

import java.io.Serializable;

/**
 * @author zouyu
 * @description
 * @date 2019/10/25
 */
public class Response implements Serializable {
    private static final long serialVersionUID = -1858571744709120917L;
    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Response{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
