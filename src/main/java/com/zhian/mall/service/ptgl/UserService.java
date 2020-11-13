package com.zhian.mall.service.ptgl;

import com.zhian.mall.base.ResultVo;

import java.util.Map;

public interface UserService {

    /**
     * 获取用户信息
     * @param paramsMap
     * @return
     */
    ResultVo getUser(Map<String,Object> paramsMap);

    /**
     * 获取用户角色
     */
    //ResultVo getUserRole(Map<String,Object> paramsMap);
}
