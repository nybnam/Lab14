package edu.handong.csee.java.lab14.prob4;

import java.util.Scanner;

public class BoundaryMain {
	private int count = 0;
	private int A[];
	private int num;
	
	public void run(){
		
		Boundary boundary = new Boundary();
		int[] A = new int[5];
		boundary.setArray(A);
		
		try{
			while(true){
				Scanner keyboard = new Scanner(System.in);
				System.out.print("Enter an integer : ");
				num = keyboard.nextInt();
				if (count == 5)
					throw new Exception("Invalid array index access!");
				boundary.numberToArray(count,num);
				count++;
			}
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}	
		
	public static void main(String args[]){
		BoundaryMain prob4 = new BoundaryMain();
		prob4.run();
	}
}
