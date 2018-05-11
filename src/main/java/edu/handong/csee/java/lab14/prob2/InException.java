package edu.handong.csee.java.lab14.prob2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InException {
	private int x, y; // variables to save integer
	
	public void getInteger(){
		
		Scanner keyboard = new Scanner(System.in); // instantiate scanner
		
		try{
			System.out.print("x = "); // order input to user
			x = keyboard.nextInt();	  // input integer to x
			System.out.print("y = "); // order input to user
			y = keyboard.nextInt();   // input integer to x
			
			
		}catch (ArithmeticException e){
			System.out.println("java.lang.ArithmeticException: " + e.getMessage()); // print exception's detail 
		}
		
		 catch (InputMismatchException e){
			System.out.println("java.util.InputMismatchException");		// print exception's detail
		}
	}
	
	public void calculateAndPrint(){
		System.out.print(x/y); // calculate x/y and print
	}
	
	public void run(){
		getInteger(); // run getInteger() method
		calculateAndPrint(); // run calculateAndPrint() method
	}
	
	public static void main(String[] args){
		InException prob2 = new InException(); // instantiate class InException
		prob2.run();	// run run();
	}
}
