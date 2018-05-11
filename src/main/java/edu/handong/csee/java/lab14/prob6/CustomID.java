package edu.handong.csee.java.lab14.prob6;
import java.util.Scanner;

public class CustomID {
	private String name = "null";
	private int age = 0;
	private String race = "null";
	
	public void setAndPrintName() throws Exception{
		if(name != "null")
			return;
		System.out.println("Enter your name: ");
		Scanner keyboard = new Scanner(System.in);
		name = keyboard.next();
		if(name.length()<5)
			throw new Exception("Your name is short! Try again!");
		else{
			System.out.println("Name is valid.");
			System.out.println("Name: " + name);
		}
	}
	
	public void setAndPrintAge() throws Exception{
		if(age != 0)
			return;
		System.out.println("Enter your age: ");
		Scanner keyboard = new Scanner(System.in);
		age = keyboard.nextInt();
		if(age<18)
			throw new Exception("You are too young! Try again!");
		else{
			System.out.println("Age is valid.");
			System.out.println("Age: " + age);
		}
	}
	
	
	public void setAndPrintRace() throws Exception{
		if(race != "null")
			return;
		System.out.println("Enter your race: ");
		Scanner keyboard = new Scanner(System.in);
		race = keyboard.next();
		if(race != "Vulcan" && race != "Romulan" && race!= "Klingons")
			throw new Exception("Human! Try again!");
		else{
			System.out.println("Race is valid.");
			System.out.println("Race: " + race);
		}
	}
		
	

}
