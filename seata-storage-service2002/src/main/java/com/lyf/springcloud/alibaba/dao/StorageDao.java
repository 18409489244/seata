package com.lyf.springcloud.alibaba.dao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @auther 刘耀福
 * @create 2022-01-17
 */
@Mapper
public interface StorageDao {

    //扣减库存
    void decrease(@Param("productId") Integer productId);
}
