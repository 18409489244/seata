package com.lyf.springcloud.alibaba.service;

import com.lyf.springcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @auther 刘耀福
 * @create 2022-01-17
 */
@FeignClient(value = "seata-storage",path = "/storage")
public interface StorageService
{
    @PostMapping(value = "/decrease")
    CommonResult decrease(@RequestParam("productId") Integer productId);
}
