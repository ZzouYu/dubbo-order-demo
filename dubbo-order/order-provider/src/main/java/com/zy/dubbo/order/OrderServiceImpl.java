package com.zy.dubbo.order;

import com.zy.dubbo.order.service.IOrderService;

/**
 * @author zouyu
 * @description
 * @date 2019/10/21
 */
public class OrderServiceImpl implements IOrderService {

    @Override
    public DoOrderResponse doOrder(DoOrderRequest doOrderRequest) {
        System.out.println(doOrderRequest);
        DoOrderResponse response = new DoOrderResponse();
        response.setCode("1010");
        response.setMsg("请求成功");
        response.setData(doOrderRequest);
        System.out.println(response);
        return response;
    }
}
