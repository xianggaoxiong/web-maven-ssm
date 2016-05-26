package com.bestseller.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bestseller.entity.User;
import com.bestseller.service.UserService;





public class MybatisTest {
	private UserService userService=null;
	@Before
	public void before(){
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		userService=(UserService) context.getBean("userServiceImpl");
	}
	
	@Test
	public void test01(){
		User user=userService.getByUserName("xgx");
		System.out.println(user);
	}
}
