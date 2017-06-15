package com.iss.java.dao;

import com.iss.java.model.AssociationAndCourse;

public interface AssociationAndCourseMapper {
    int deleteByPrimaryKey(Integer associtionCourseId);

    int insert(AssociationAndCourse record);

    int insertSelective(AssociationAndCourse record);

    AssociationAndCourse selectByPrimaryKey(Integer associtionCourseId);

    int updateByPrimaryKeySelective(AssociationAndCourse record);

    int updateByPrimaryKey(AssociationAndCourse record);
}