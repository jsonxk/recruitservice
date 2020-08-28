package com.aries.recruit.userbaseclient.param;

import lombok.Data;

import java.io.Serializable;

/**
 * Description: 账户信息查询
 * Author: xk
 * Date: 2020/8/28 19:27
 */
@Data
public class UserInfoQueryDTO implements Serializable {

    /**
     * 用户编码
     */
    private Integer userId;

    /**
     * 姓名
     */
    private String userName;

    /**
     * 身份证
     */
    private String idCard;

    /**
     * 是否有效
     */
    private Integer isValid;
}
