package edu.handong.csee.java.lab14.prob6;

public class Main {
	public static void main(String[] args){
		CustomID id = new CustomID();	// instantiate class CustomID
		while(true){
			try{
				id.setAndPrintName();	// set name and print it
				id.setAndPrintAge();	// set age and print it
				id.setAndPrintRace();	// set race and print it 
				break;		// all member is entered, escape the loop
			} catch (Exception e){
				System.out.println(e.getMessage());	// print what exception is occured
			}
		}
	}
}
