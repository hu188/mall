package com.zhian.mall.dao.ptgl;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
@Mapper
public interface UserDao {

    /**
     * 获取用户信息
     */
    Map<String,Object> getUser(@Param("params") Map<String,Object> paramsMap);
}
