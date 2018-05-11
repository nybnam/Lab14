package edu.handong.csee.java.lab14.prob3;
import java.util.Scanner;

public class PowerCalc {
	private long n, p; // variable to save long type
	
	public long power(long n, long p){
		long power = 1;	// initialize power to 1
		for(int i=1;i<=p;i++){
			power *= n;	// multiply n for p times
		}
		return power; // return the value
	}
	
	public void run(){
		Scanner keyboard = new Scanner(System.in); // instantiate scanner
		
		try{
			n = keyboard.nextLong(); // get long from keyboard
			p = keyboard.nextLong(); // get long from keyboard
			
			if(n==0 && p==0)
				throw new Exception ("n or p should not be zero"); // throw exception that 0^0 can't be calculate
			if(n<0 || p<0)
				throw new Exception ("n or p should not be negative"); // throw exception that negative can't calculate
			
			System.out.println(power(n,p)); // print the value from power
			
		} catch(Exception e){
				System.out.println("java.lang.Exception: " + e.getMessage()); // print what exception exist
			}
	}
	
	public static void main(String args[]){
		PowerCalc prob3 = new PowerCalc(); // instantiate class PowerCalc
		prob3.run(); // run run() method
	}
}
