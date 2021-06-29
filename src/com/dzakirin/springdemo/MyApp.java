package com.dzakirin.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create object
		Coach theBaseballCoach = new BaseballCoachImpl();
		Coach theTrackCoach = new TrackCoachImpl();
		// Use object
		System.out.println(theBaseballCoach.getDailyWorkout());
		System.out.println(theTrackCoach.getDailyWorkout());

	} 

}
 