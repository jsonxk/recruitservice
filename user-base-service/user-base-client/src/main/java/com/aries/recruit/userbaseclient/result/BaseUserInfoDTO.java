package com.aries.recruit.userbaseclient.result;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Description: TODO
 * Author: xk
 * Date: 2020/8/28 19:42
 */
@Setter
@Getter
public class BaseUserInfoDTO implements Serializable {

    private static final long serialVersionUID = -6026077230739081692L;

    /**
     * userId
     */
    private Integer userId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 手机号
     */
    private String mobilePhone;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 地址
     */
    private String address;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 城市编码
     */
    private Integer cityCode;

}
