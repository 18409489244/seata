package com.lyf.springcloud.alibaba.controller;
import com.lyf.springcloud.alibaba.entity.CommonResult;
import com.lyf.springcloud.alibaba.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @auther 刘耀福
 * @create 2022-01-17
 */
@RestController
@RequestMapping("/storage")
public class StorageController {

    @Autowired
    private StorageService storageService;

    /**
     * 扣减库存
     */
    @RequestMapping("/decrease")
    public CommonResult decrease(@RequestParam("productId") Integer productId) {
        storageService.decrease(productId);
        return new CommonResult(200,"扣减库存成功！");
    }
}
