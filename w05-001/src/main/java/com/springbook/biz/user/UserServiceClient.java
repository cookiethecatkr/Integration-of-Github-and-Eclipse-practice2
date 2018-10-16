package com.springbook.biz.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {
	public static void main(String[] args) {
		//1.Spring 컨데이너를 구동한다 
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		//2. Spring 컨테이너로부터 UserServiceImple 객체를 Lookup 한다 . 
		UserService userService = (UserService) container.getBean("userService");
		
		
	}
}
