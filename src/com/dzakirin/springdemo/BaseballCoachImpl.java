package com.dzakirin.springdemo;

public class BaseballCoachImpl implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}
}
