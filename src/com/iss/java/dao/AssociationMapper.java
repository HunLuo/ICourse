package com.iss.java.dao;

import com.iss.java.model.Association;

public interface AssociationMapper {
    int deleteByPrimaryKey(Integer associationId);

    int insert(Association record);

    int insertSelective(Association record);

    Association selectByPrimaryKey(Integer associationId);

    int updateByPrimaryKeySelective(Association record);

    int updateByPrimaryKey(Association record);
}