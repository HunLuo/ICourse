package com.iss.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iss.java.model.User;
import com.iss.java.service.UserService;
import com.iss.java.service.impl.UserSeviceImpl;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/iss/config/spring.xml")
public class UserSeviceImplTest {
	@Autowired
	UserService us ;
	@Test
	public void test() {
//		User user = new User();
//		user.setUserinfoUsername("test1");
//		user.setUserinfoPassword("234321");
//		user.setUserType(1);
		User user;
	
	if(us.isUserExist("qhl")){
		 user=	us.getUserByName("qhl");
		System.out.println(user.getUserinfoUsername());
		}
	else System.out.println("User is not exist!");
	}

}
