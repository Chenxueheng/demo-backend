package com.example.demovue.dao;

import com.example.demovue.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface userDao {
    public User getUserByMassage(@Param("username")String username, @Param("password")String password);
}
