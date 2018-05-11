package edu.handong.csee.java.lab14.prob6;
import java.util.Scanner;

public class CustomID {
	private String name = "null"; // variable to save name
	private int age = 0;	 // variable to save age
	private String race = "null"; // variable to save race
	
	public void setAndPrintName() throws Exception{
		if(name != "null")
			return;		// if user already set name, return
		System.out.println("Enter your name: "); // order input to user
		Scanner keyboard = new Scanner(System.in); // instantiate scanner
		name = keyboard.next();	// get string from keyboard
		if(name.length()<5){
			name = "null"; // if user set short name, set name to null
			throw new Exception("Your name is short! Try again!"); // throw exception for try setting name again
		}
		else{
			System.out.println("Name is valid."); // print name is okay
			System.out.println("Name: " + name); // print that input name successfully
		}
	}
	
	public void setAndPrintAge() throws Exception{
		if(age != 0)
			return;		// if user already set age, return
		System.out.println("Enter your age: ");  // order input to user
		Scanner keyboard = new Scanner(System.in); // instantiate scanner
		age = keyboard.nextInt(); // get integer from keyboard
		if(age<18){
			age = 0; // if user set young age, set age to 0
			throw new Exception("You are too young! Try again!"); // throw exception for try setting age again
		}
		else{
			System.out.println("Age is valid."); // print age is okay
			System.out.println("Age: " + age); // print that input age successfully
		}
	}
	
	
	public void setAndPrintRace() throws Exception{
		if(race != "null")
			return;		// if user already set race, return
		System.out.println("Enter your race: "); // order input to user
		Scanner keyboard = new Scanner(System.in); // instantiate scanner
		race = keyboard.next(); // get string from keyboard
		if((race.equalsIgnoreCase("Vulcan")) && (race.equalsIgnoreCase("Romulan")) && (race.equalsIgnoreCase("Vulcan"))){
			System.out.println(race);
			race = "null";// if user didn't set race from them, set race to null
			throw new Exception("Human! Try again!"); // throw exception for try setting race again
		}
		else{
			System.out.println("Race is valid."); // print race is okay
			System.out.println("Race: " + race);// print that input race successfully
		}
	}
	
	public void initialization(){
		name = "null";
		age = 0;
		race = "null";
	}
		
	

}
