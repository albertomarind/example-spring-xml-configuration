package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	private FortuneService fortuneService;
	
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout(){
		return "Spend 30 minutes on batting practice";
	}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartupStuff() {
		System.out.println("BaseballCoach: inside method doMYStartupStuff");
	}
	
	// add a destroy method
	public void doMyCleanupStuffYoYo(){
		System.out.println("BaseballCoach: inside method doMyCleanupStuffYoYo");
	}
}
