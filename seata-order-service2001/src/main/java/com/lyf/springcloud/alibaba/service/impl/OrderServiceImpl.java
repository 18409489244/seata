package com.lyf.springcloud.alibaba.service.impl;

import com.lyf.springcloud.alibaba.dao.OrderDao;
import com.lyf.springcloud.alibaba.domain.Order;
import com.lyf.springcloud.alibaba.service.OrderService;
import com.lyf.springcloud.alibaba.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @auther 刘耀福
 * @create 2022-01-17
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService
{
    @Resource
    private OrderDao orderDao;

    @Resource
    private StorageService storageService;

    /**
     * 简单说：下订单->扣库存
     */
    @Override
    @GlobalTransactional
    public void create(Order order)
    {
        orderDao.create(order);
        int a = 2/0;
        storageService.decrease(order.getProductId());
    }
}
