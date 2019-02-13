package com.breath.controller;

import com.breath.db.dao.UserMapper;
import com.breath.db.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @ResponseBody
    @RequestMapping(value = "/test")
    public String getUserInfo() {
        User user = userMapper.selectByPrimaryKey(1);
        return user!=null?user.getAge():"haha";
    }
}