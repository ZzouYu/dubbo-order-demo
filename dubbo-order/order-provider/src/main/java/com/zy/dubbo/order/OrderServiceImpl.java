package com.zy.dubbo.order;

import com.zy.dubbo.order.service.IOrderService;
import org.springframework.stereotype.Service;

/**
 * @author zouyu
 * @description
 * @date 2019/10/21
 */
@Service("orderService")
public class OrderServiceImpl implements IOrderService {

    @Override
    public DoOrderResponse doOrder(DoOrderRequest doOrderRequest) {
        System.out.println(doOrderRequest);
        DoOrderResponse response = new DoOrderResponse();
        response.setCode("000");
        response.setMsg("请求成功");
        response.setData(doOrderRequest);
        System.out.println(response);
        return response;
    }
}
