package com.lyf.springcloud.alibaba.service.impl;

import com.lyf.springcloud.alibaba.dao.StorageDao;
import com.lyf.springcloud.alibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @auther 刘耀福
 * @create 2022-01-17
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    /**
     * 扣减库存
     */
    @Override
    public void decrease(Integer productId) {
        log.info("------->storage-service中扣减库存开始");
        storageDao.decrease(productId);
        log.info("------->storage-service中扣减库存结束");
    }
}
