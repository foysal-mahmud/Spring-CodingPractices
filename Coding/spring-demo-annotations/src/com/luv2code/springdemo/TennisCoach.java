package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> TennisCoach; inside default constuctor!! ");
	}
	
	/*
	@Autowired
	public void setFortuneService(FortuneService theFortuneService){
		System.out.println(">> TennisCoach: inside setFortuneService ");
		fortuneService = theFortuneService;
	}

*/
	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volly";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
