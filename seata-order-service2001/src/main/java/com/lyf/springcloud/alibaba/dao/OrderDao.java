package com.lyf.springcloud.alibaba.dao;

import com.lyf.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @auther 刘耀福
 * @create 2022-01-17
 */
@Mapper
public interface OrderDao
{
    //1 新建订单
    void create(Order order);

}
