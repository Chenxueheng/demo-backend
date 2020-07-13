package com.example.demovue.controller;

import com.alibaba.fastjson.JSON;
import com.example.demovue.bean.User;
import com.example.demovue.dao.userDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class LoginController {

    @Autowired
    userDao UserDao;

    @RequestMapping("/login")
    public String login(@RequestBody User user){
        String flag = "error";
        User us = UserDao.getUserByMassage(user.getUsername(),user.getPassword());
        if (us != null) {
            flag = "ok";
        }
        HashMap<String,Object> res = new HashMap<>();
        res.put("flag",flag);
        res.put("user",user);
        String res_json = JSON.toJSONString(res);
        return res_json;
    }
}
