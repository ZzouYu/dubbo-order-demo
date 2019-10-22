package com.zy.dubbo.order.service;

import com.zy.dubbo.order.DoOrderRequest;
import com.zy.dubbo.order.DoOrderResponse;

public interface IOrderService {
    DoOrderResponse doOrder(DoOrderRequest doOrderRequest);
}
