package com.iss.java.dao;

import com.iss.java.model.StudentAndAssociation;

public interface StudentAndAssociationMapper {
    int deleteByPrimaryKey(Integer studentAssociationId);

    int insert(StudentAndAssociation record);

    int insertSelective(StudentAndAssociation record);

    StudentAndAssociation selectByPrimaryKey(Integer studentAssociationId);

    int updateByPrimaryKeySelective(StudentAndAssociation record);

    int updateByPrimaryKey(StudentAndAssociation record);
}