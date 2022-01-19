package com.lyf.springcloud.alibaba.service;

/**
 * @auther 刘耀福
 * @create 2022-01-17
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Integer productId);
}
