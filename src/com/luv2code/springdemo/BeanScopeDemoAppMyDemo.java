package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoAppMyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext2-my-demo.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		//print out the results
		System.out.println("n Pointing to the same object: " + result);
		
		System.out.println("/n Memory location for theCoach: " + theCoach);
		
		System.out.println("/n Memory location for alphaCoach: " + alphaCoach);
		
		//close the context
		context.close();

	}

}
