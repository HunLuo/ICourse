package com.iss.java.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iss.java.model.User;
import com.iss.java.service.UserService;

@Controller
public class UserAction {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/save.do")
	@ResponseBody
	public String save(User user) {
		Boolean flag = userService.save(user);

		return flag.toString();
	}

	@RequestMapping(value = "/login")
	public String login(User user) {
		String username = user.getUserinfoUsername();
		String password = user.getUserinfoPassword();
		
		if (userService.isUserExist(username)) {
			User temp = userService.getUserByName(username);
			if(temp.getUserinfoPassword().equals(password))
			return "login_success";
		}
		return "login";
	}
}
