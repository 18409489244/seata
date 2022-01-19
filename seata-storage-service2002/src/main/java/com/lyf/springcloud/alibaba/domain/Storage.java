package com.lyf.springcloud.alibaba.domain;

import lombok.Data;

/**
 * @auther 刘耀福
 * @create 2022-01-17
 */
@Data
public class Storage {

    private Integer id;

    /**
     * 产品id
     */
    private Integer productId;

    /**
     * 总库存
     */
    private Integer count;

}
