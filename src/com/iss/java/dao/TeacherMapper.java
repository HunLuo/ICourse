package com.iss.java.dao;

import java.util.List;
import java.util.Map;

import com.iss.java.model.Teacher;

public interface TeacherMapper {
    int deleteByPrimaryKey(Integer teacherId);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer teacherId);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
    
    List<Teacher> selectTeachersByParams(Map<String,Object> params);
    
    public int countTeachers() ;
    
}