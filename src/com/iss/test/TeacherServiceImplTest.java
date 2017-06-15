package com.iss.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iss.java.service.TeacherService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/iss/config/spring.xml")
public class TeacherServiceImplTest {
	@Autowired
	TeacherService teacherService;
	@Test
	public void test() {
		Map<String,Object> params = new HashMap<>();
		Integer offset=0;
		Integer limit=0;
		String teacherName="test";
		Integer beginIndex	= offset;
		params.put("beginIndex", beginIndex);
		params.put("limit", limit);
		params.put("teacherName", teacherName);
		Map<String ,Object> teachers =teacherService.getTeachersByparams(params);
		System.out.println(teachers.get("total"));
	}

}
