package edu.handong.csee.java.lab14.prob2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InException {
	private int x, y;
	
	public void getInteger(){
		
		Scanner keyboard = new Scanner(System.in);
		
		try{
			System.out.print("x = ");
			x = keyboard.nextInt();
			System.out.print("y = ");
			y = keyboard.nextInt();
			
			
		}catch (ArithmeticException e){
			System.out.println("java.lang.ArithmeticException: " + e.getMessage());
		}
		
		 catch (InputMismatchException e){
			System.out.println("java.util.InputMismatchException");
		}
	}
	
	public void calculateAndPrint(){
		System.out.print(x/y);
	}
	
	public void run(){
		getInteger();
		calculateAndPrint();
	}
	
	public static void main(String[] args){
		InException prob2 = new InException();
		prob2.run();
	}
}
