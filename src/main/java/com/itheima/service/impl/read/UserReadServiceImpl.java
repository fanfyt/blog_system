package com.itheima.service.impl.read;

import com.itheima.dao.read.UserReadMapper;
import com.itheima.model.domain.User;
import com.itheima.service.read.UserReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class UserReadServiceImpl implements UserReadService {
    @Autowired
    UserReadMapper userReadMapper;

    @Override
    public User getUser(User user) {
        User u =  userReadMapper.getUser(user.getId());
        return u;
    }
}
