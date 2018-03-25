package com.example.demo;

import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.interfaces.Knight;

public class knightMain {
	public static void main(String[]args) {
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("bean1.xml");
		Knight knight=context.getBean(Knight.class);
		knight.doQuest();
		context.close();
		//<aop:config proxy-target-class="true"/>
		/*
		  <bean id="braveknight" class="com.example.demo.BraveKnight">
			<constructor-arg ref="quest"/>
			</bean>
		 */
	}

}
