package com.lyf.springcloud.alibaba.controller;
import com.lyf.springcloud.alibaba.domain.Order;
import com.lyf.springcloud.alibaba.entity.CommonResult;
import com.lyf.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @auther 刘耀福
 * @create 2022-01-17
 */
@RestController
@RequestMapping("/order")
public class OrderController
{
    @Resource
    private OrderService orderService;

    @GetMapping("/add")
    public CommonResult add(){
        Order order = new Order();
        order.setProductId(9);
        order.setStatus(0);
        order.setTotalAmount(100);
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
