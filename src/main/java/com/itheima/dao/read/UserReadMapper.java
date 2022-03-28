package com.itheima.dao.read;

import com.itheima.model.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserReadMapper {
//    @Select("SELECT id,username,email,created,valid FROM t_user where id = #{id}")
    public User getUser(Integer id);

}
