package com.luv2code.springdemo;

import java.util.List;
import java.util.Random;

public class RandomFortuneServiceImpl implements FortuneService {

	private List<String> fortunes;
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		Random random = new Random();
		int randomInt = random.nextInt(3);
		return fortunes.get(randomInt);
	}

	public List<String> getFortunes() {
		return fortunes;
	}

	public void setFortunes(List<String> fortunes) {
		this.fortunes = fortunes;
	}
	
	

}
