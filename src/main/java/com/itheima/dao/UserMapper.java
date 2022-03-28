package com.itheima.dao;

import com.itheima.model.domain.Authority;
import com.itheima.model.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;


/**
 * @author FL
 */
@Mapper
public interface UserMapper {


    @Select("SELECT id,username,email,valid FROM t_user")
    public List<User> UserMapper();

    @Select("SELECT id,username,email,valid FROM t_user WHERE id = #{id}")
    public List<User> USERS(Integer id);


    //权限处理
    @Insert("INSERT INTO t_user_authority (user_id,authority_id) VALUES (#{user_id},#{authority_id})")
    public int addAuth(Authority authority);


    @Delete("DELETE FROM t_user WHERE id = #{id}")
    public int deleteUser(Integer id);

}
