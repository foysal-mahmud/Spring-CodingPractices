package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	// define private field for dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}










