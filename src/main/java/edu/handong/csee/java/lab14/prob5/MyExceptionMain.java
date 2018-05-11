package edu.handong.csee.java.lab14.prob5;
import java.util.Scanner;

public class MyExceptionMain {
	
	static void Test(String str) throws MyException{
		if(str.equals("null"))
			throw new MyException("String val is null"); // if str is null, throw exception
		else
			System.out.println("String val is: " + str); // print str's value
	}
	
	public static void main(String[] args){
		String str;	// declare str
		Scanner keyboard = new Scanner(System.in); // instantiate scanner
		str = keyboard.nextLine();	// get input from keyboard
		try{
			Test(str); // run test(string) method
		} catch(MyException e){
			System.out.println("Inside catch block: " + e); // print exception's detail
		}
	}
}
