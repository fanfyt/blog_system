package com.itheima.web.user;

import com.itheima.model.domain.Authority;
import com.itheima.model.domain.User;
import com.itheima.service.UserService;
import com.itheima.service.read.UserReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/add")
public class AddUserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserReadService userReadService;

    public static  final  int NORMAL = 2; //普通用户权限

    @GetMapping("/add")
    @ResponseBody
    public void addUser(String username,String password){
        System.out.println(username);
        System.out.println(password);
        //使用BCryptPasswordEncoder进行加密
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println("encoder:"+encoder);
        User user = new User();

//        String psd = BCrypt.hashpw(password,BCrypt.gensalt());//第二个参数进行加盐

        user.setUsername(username);
        user.setPassword(encoder.encode(password));
        user.setValid(1);
        int id = userService.addUser(user);

        Authority auth = new Authority();
        auth.setUser_id(id);
        auth.setAuthority_id(NORMAL);

        try{
            userService.addAuth(auth);
            System.out.println("auth插入完成");
        }catch (Exception e){
            System.out.println("auth插入失败");
            e.printStackTrace();
        }
    }

}
