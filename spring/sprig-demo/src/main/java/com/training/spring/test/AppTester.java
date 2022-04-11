package com.training.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.spring.bean.Person;
import com.training.spring.config.AppConfig;

public class AppTester {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Person p = (Person)context.getBean("person");
		
		System.out.println("Car Detail: " +p.getdetails());

	}

}
