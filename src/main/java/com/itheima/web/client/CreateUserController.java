package com.itheima.web.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author FL
 */

@Controller
@RequestMapping("/createUser")
public class CreateUserController {

    /**
     * 注册用户账号
     * */
    @RequestMapping("/add")
    public String createUser(){

        return "newUser";
    }
}
