package com.zy.dubbo.order;

import com.zy.dubbo.order.service.IOrderPayService;
import org.springframework.stereotype.Service;

/**
 * @author zouyu
 * @description
 * @date 2019/10/23
 */
@Service("payService")
public class OrderPayServiceImpl implements IOrderPayService {
    @Override
    public String pay(String amount) {
        return "hello , i pay "+amount;
    }
}
