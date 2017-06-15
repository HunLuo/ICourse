package com.iss.java.dao;

import com.iss.java.model.Stuclass;

public interface StuclassMapper {
    int deleteByPrimaryKey(Integer classId);

    int insert(Stuclass record);

    int insertSelective(Stuclass record);

    Stuclass selectByPrimaryKey(Integer classId);

    int updateByPrimaryKeySelective(Stuclass record);

    int updateByPrimaryKey(Stuclass record);
}