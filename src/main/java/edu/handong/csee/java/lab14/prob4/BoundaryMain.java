package edu.handong.csee.java.lab14.prob4;

import java.util.Scanner;

public class BoundaryMain {
	private int count = 0; // variable to save integer to count inputting number
	private int A[];	// array to initialize arr in Boundary
	private int num;	// variable to save integer that get from keyboard
	
	public void run(){
		
		Boundary boundary = new Boundary(); // instantiate class Boundary
		int[] A = new int[5];	// initialize array A 
		boundary.setArray(A);	// initialize bondary's array
		
		try{
			while(true){
				Scanner keyboard = new Scanner(System.in);	// instantiate scanner
				System.out.print("Enter an integer : ");  // order input to user
				num = keyboard.nextInt();	// get integer from keyboard
				if (count == 5)
					throw new Exception("Invalid array index access!");	// throw exception when inputting number is more than 5
				boundary.numberToArray(count,num);	// set num to array's member
				count++;	// increase inputting number's count
			}
		} catch(Exception e){
			System.out.println(e.getMessage());	// print exception's detail
		}
	}	
		
	public static void main(String args[]){
		BoundaryMain prob4 = new BoundaryMain(); // instantiate class BoundaryMain
		prob4.run(); // run run() method
	}
}
