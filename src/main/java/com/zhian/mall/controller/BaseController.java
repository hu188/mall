package com.zhian.mall.controller;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseController {
    private static Logger log = LoggerFactory.getLogger(BaseController.class);

    /**
     * 解析post请求参数
     * @param body
     * @return
     */
    @SuppressWarnings("unchecked")
    protected Map<String,Object> getPostParams(String body){
        if(log.isDebugEnabled()){
            log.debug("params:{}",body);
        }
        return JSON.parseObject(body,Map.class);
    }

    /**
     * 解析get请求参数
     * @param request
     * @return
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    protected Map<String, Object> getGetParams(HttpServletRequest request) throws Exception{
        Map<String, Object> paramMap = new HashMap<String,Object>();
        Enumeration<String> names = request.getParameterNames();
        while(names.hasMoreElements()){
            String name = names.nextElement();
            paramMap.put(name, request.getParameter(name));
        }
        if(log.isDebugEnabled()){
            log.debug("params: {}", paramMap.toString());
        }
        return paramMap;
    }
}
