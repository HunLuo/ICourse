package com.iss.java.dao;

import java.util.List;

import com.iss.java.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userinfoUserid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userinfoUserid);

    User selectByUsername(String username);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectAllUsers();		



}