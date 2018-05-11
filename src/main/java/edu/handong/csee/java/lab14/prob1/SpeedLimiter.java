package edu.handong.csee.java.lab14.prob1;
import java.util.Scanner;

import java.util.Random;

public class SpeedLimiter {
	
	private int speedLimit;	// variable to save speedlimit
	private int yourSpeed;	// variable to save speed that has random number
	
	public void run(){
		Scanner keyboard = new Scanner(System.in); // instantiate scanner
		Random random = new Random();	// instantiate random
	
		try{
			System.out.println("Set the speed limit, officer : ");	// request user to set speed limit
			speedLimit = keyboard.nextInt();	// get speed limit
		
			yourSpeed = random.nextInt(100)+1;	// set yourspeed to random number
		
			if(speedLimit<yourSpeed)
				throw new Exception("Speed Limit " + speedLimit + "km exceeded!"); // exception for marking exceeding
			
			System.out.println("You are a law abiding citizen!");	// print it's not exceeded
			System.out.println("Your current speed : " + yourSpeed); // print yourspeed
			
		
		} catch (Exception e){
			System.out.println(e.getMessage ()); // print exception message
			System.out.println("You're being fined.");	// print it's exceeded
			System.out.println("Your current speed : " + yourSpeed); // print yourspeed
		}
	
	}
	
	public static void main(String[] args){
		SpeedLimiter prob1 = new SpeedLimiter(); // instantiate class SpeedLimiter
		prob1.run(); // run this method
	}

}
