package com.itheima.web.user;

import com.itheima.model.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname AdminController
 * @Description 后台管理模块
 * @Date 2019-3-14 10:39
 * @Created by Liang
 */
@Controller
@RequestMapping("/user")
public class UserController {


    @PostMapping("/add")
    @ResponseBody
    public String add(){
        System.out.println("2333==============");
        return "2333";
    }

    //跳转到注册页
    @GetMapping(value = "/comm/addUser")
    public String addUser(){
        return "comm/add_user";
    }




}
