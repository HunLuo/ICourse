package com.iss.java.service;

import java.util.Map;

import org.springframework.stereotype.Service;

public interface TeacherService {
	public Map<String, Object> getTeachersByparams(Map<String, Object> params) ;
	}
