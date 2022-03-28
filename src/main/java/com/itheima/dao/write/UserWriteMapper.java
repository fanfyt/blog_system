package com.itheima.dao.write;

import com.itheima.model.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserWriteMapper {

    int addUser(User user);
}
