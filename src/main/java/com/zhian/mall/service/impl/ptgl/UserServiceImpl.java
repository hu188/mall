package com.zhian.mall.service.impl.ptgl;

import com.zhian.mall.base.ResultVo;
import com.zhian.mall.dao.ptgl.UserDao;
import com.zhian.mall.service.ptgl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    /**
     * 获取用户信息
     * @param paramsMap
     * @return
     */
    @Override
    public ResultVo getUser(Map<String, Object> paramsMap) {
        ResultVo rv = ResultVo.build();
        Map<String, Object> user = userDao.getUser(paramsMap);
        if(user.isEmpty()){
           return rv.setMsg(200,"用户不存在！");
        }
        if(!user.get("password").equals(paramsMap.get("password"))){
            return rv.setMsg(200,"密码错误，请重试！");
        }
        user.remove("password");

        return rv.setData(user);
    }
}
