package edu.handong.csee.java.lab14.prob1;
import java.util.Scanner;
import java.util.Random;

public class SpeedLimiter {
	
	private int speedLimit;
	private int yourSpeed;
	
	public void run(){
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();
	
		try{
			System.out.println("Set the speed limit, officer : ");
			speedLimit = keyboard.nextInt();
		
			yourSpeed = random.nextInt(100)+1;
		
			if(speedLimit<yourSpeed)
				throw new Exception("Speed Limit " + speedLimit + "km exceeded!");
			
			System.out.println("You are a law abiding citizen!");
			System.out.println("Your current speed : " + yourSpeed);
			
		
		} catch (Exception e){
			System.out.println(e.getMessage ());
			System.out.println("You're being fined.");
			System.out.println("Your current speed : " + yourSpeed);
		}
	
	}
	
	public static void main(String[] args){
		SpeedLimiter prob1 = new SpeedLimiter();
		prob1.run();
	}

}
