package com.iss.java.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iss.java.dao.TeacherMapper;
import com.iss.java.model.Teacher;
import com.iss.java.service.TeacherService;

@Service("TeacherService")
public class TeacherServiceImpl implements TeacherService {
	@Autowired
	TeacherMapper teacherMapper ;
	@Override
	public Map<String, Object> getTeachersByparams(Map<String, Object> params) {
		// TODO Auto-generated method stub
		Map<String ,Object> tableSource = new HashMap<>();
		List<Teacher> teacherlist = teacherMapper.selectTeachersByParams(params);
		int count = teacherMapper.countTeachers();
		tableSource.put("total",count);
		tableSource.put("rows", teacherlist);
		return tableSource;
	}

}
