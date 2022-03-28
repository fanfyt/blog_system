package com.itheima.service;

import com.itheima.model.domain.Authority;
import com.itheima.model.domain.User;

public interface UserService {

    //新增用户user
    public int addUser(User user);
    //新增用户权限插入
    public int addAuth(Authority authority);
    //修改用户user
    public int updateUser(User user);
    //删除用户user
    public int deleteUser(User user);

}
