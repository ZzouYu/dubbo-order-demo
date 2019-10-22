package com.zy.dubbo.user;

import com.zy.dubbo.order.DoOrderRequest;
import com.zy.dubbo.order.DoOrderResponse;
import com.zy.dubbo.order.service.IOrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("order-consumer.xml");
        IOrderService iOrderService = (IOrderService) context.getBean("orderService");
        DoOrderRequest doOrderRequest = new DoOrderRequest();
        doOrderRequest.setName("zy");
        DoOrderResponse response = iOrderService.doOrder(doOrderRequest);
    }
}
