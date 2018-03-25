package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Maintest {
	public static void main(String []args) {
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("testxml.xml");
		HelloWorldInterface h=context.getBean(HelloWorldInterface.class);
		h.HelloWorld();
		context.close();
	}

}
