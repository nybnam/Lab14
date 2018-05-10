package edu.handong.csee.java.lab14.prob3;
import java.util.Scanner;

public class PowerCalc {
	private long n, p;
	
	public long power(long n, long p){
		long power = 1;
		for(int i=1;i<=p;i++){
			power *= n;
		}
		return power;
	}
	
	public void run(){
		Scanner keyboard = new Scanner(System.in);
		
		try{
			n = keyboard.nextLong();
			p = keyboard.nextLong();
			
			if(n==0 && p==0)
				throw new Exception ("n or p should not be zero");
			if(n<0 || p<0)
				throw new Exception ("n or p should not be negative");
			
			System.out.println(power(n,p));
			
		} catch(Exception e){
				System.out.println("java.lang.Exception: " + e.getMessage());
			}
	}
	
	public static void main(String args[]){
		PowerCalc prob3 = new PowerCalc();
		prob3.run();
	}
}
