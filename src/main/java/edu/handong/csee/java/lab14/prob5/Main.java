package edu.handong.csee.java.lab14.prob5;
import java.util.Scanner;

public class Main {
	
	static void myTest(String str) throws MyException{
		if(str.equals("null"))
			throw new MyException("String val is null");
		else
			System.out.println("String val is:" + str);
	}
	
	public static void main(String[] args){
		String str;
		Scanner keyboard = new Scanner(System.in);
		str = keyboard.nextLine();
		try{
			myTest(str);
		} catch(MyException e){
			System.out.println("Inside catch block: " + e);
		}
	}
}
