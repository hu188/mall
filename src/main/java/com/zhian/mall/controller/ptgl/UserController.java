package com.zhian.mall.controller.ptgl;

import com.zhian.mall.controller.BaseController;
import com.zhian.mall.service.ptgl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public String login(@RequestParam String username,@RequestParam String password){
        Map<String,Object > map = new HashMap<String,Object>();
        map.put("username",username);
        map.put("password",password);

        return userService.getUser(map).toJSON();
    }
}
