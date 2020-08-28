package com.aries.recruit.basegateway.client;

import lombok.Data;

import java.util.List;

/**
 * Description: 统一对象结果返回
 * Author: xk
 * Date: 2020/8/28 19:20
 */
@Data
public class GWListResult<T> {

    /**
     * 返回结果数据列表
     */
    private List<T> data;

    /**
     * 状态
     */
    private Integer code ;
}
