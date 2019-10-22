package com.zy.dubbo.order;

import java.io.Serializable;

/**
 * @author zouyu
 * @description
 * @date 2019/10/21
 */
public class DoOrderResponse implements Serializable {
    private static final long serialVersionUID = 8899014380516605673L;
    private String code;
    private String msg;
    private Object data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DoOrderResponse{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
