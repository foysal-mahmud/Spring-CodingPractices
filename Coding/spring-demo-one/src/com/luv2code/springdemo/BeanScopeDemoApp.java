package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\nPointing to the same object: "+ result);
		
		System.out.println("\nMemory location for theCoach: "+ theCoach);
		
		System.out.println("\nMemory location fot alphaCoach:  "+ alphaCoach);
		
		//close the context
		context.close();

	}

}
