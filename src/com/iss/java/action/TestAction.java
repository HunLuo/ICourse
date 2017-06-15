package com.iss.java.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Controller
public class TestAction {
	 private static  final Log Logger =  LogFactory.getLog(TestAction.class);
	 
	@RequestMapping(value="/test")
	public String  test() {
		
		Logger.info("test 被调用");
		return "test";
	}
}
