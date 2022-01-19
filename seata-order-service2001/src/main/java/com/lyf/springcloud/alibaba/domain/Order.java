package com.lyf.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther 刘耀福
 * @create 2022-01-17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order
{
    private Integer id;//主键

    private Integer productId;//产品id

    private Integer totalAmount;//总金额

    private Integer status; //0：代付款；1：代发货
}
