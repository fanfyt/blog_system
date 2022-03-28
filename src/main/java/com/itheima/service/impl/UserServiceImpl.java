package com.itheima.service.impl;

import com.itheima.dao.UserMapper;
import com.itheima.dao.write.UserWriteMapper;
import com.itheima.model.domain.Authority;
import com.itheima.model.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    UserWriteMapper userWriteMapper;

    @Override
    public int addUser(User user) {
        int r = 0;
        try {
            r = userWriteMapper.addUser(user);//插入user表
        } catch (Exception e) {
            System.out.println("新增User时出现异常");
            e.printStackTrace();
        } finally {
            return user.getId();
        }
    }

    @Override
    public int addAuth(Authority authority) {
        int r = 0;
        try{
            r = userMapper.addAuth( authority);
        }catch (Exception e){
            System.out.println("---------------- UserServiceImpl 权限新增出现异常----------------");
            e.printStackTrace();
        }finally {
            return r;
        }
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public int deleteUser(User user) {
        return 0;
    }
}
