package com.aries.recruit.basegateway.client;

import lombok.Data;

/**
 * Description: 统一对象结果返回
 * Author: xk
 * Date: 2020/8/28 19:20
 */
@Data
public class GWResult<T> {

    /**
     * 返回结果数据
     */
    private T data;

    /**
     * 状态
     */
    private Integer code ;
}
