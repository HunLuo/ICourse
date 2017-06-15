package com.iss.java.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iss.java.service.TeacherService;
@Controller
public class TeacherAction {
	@Autowired
	TeacherService	teacherService;
	
	@RequestMapping(value="getPage")
	@ResponseBody
	public Map<String ,Object > getPageInfoByParams(String teacherName ,int limit,int offset) {
		
		Map<String,Object> params = new HashMap<>();
		Integer beginIndex =offset;
		params.put("beginIndex", beginIndex);
		params.put("limit", limit);
		params.put("teacherName", teacherName);
		
		return teacherService.getTeachersByparams(params);
		
		
	}
}
