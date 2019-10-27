package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Select;

public interface UserDao {

    @Select("select * from user where id=#{id}")
    User findById(Integer id);
}
