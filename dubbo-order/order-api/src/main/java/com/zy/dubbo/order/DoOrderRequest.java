package com.zy.dubbo.order;

import java.io.Serializable;

/**
 * @author zouyu
 * @description
 * @date 2019/10/21
 */
public class DoOrderRequest implements Serializable {
    private static final long serialVersionUID = -6672005422841969881L;
    private   String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DoOrderRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
