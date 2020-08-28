package com.aries.recruit.userbaseclient.provider;

import com.aries.recruit.basegateway.client.GWResult;
import com.aries.recruit.userbaseclient.result.BaseUserInfoDTO;

/**
 * Description: 用户基础信息查询
 * Author: xk
 * Date: 2020/8/28 19:44
 */
public interface UserBaseQueryProvider {

    /**
     * 根据用户编码查询用户信息
     */
    GWResult<BaseUserInfoDTO> getById(Integer userId);

}
