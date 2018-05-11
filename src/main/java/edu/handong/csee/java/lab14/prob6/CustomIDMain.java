package edu.handong.csee.java.lab14.prob6;

public class CustomIDMain {
	public static void main(String[] args){
		CustomID id = new CustomID();	// instantiate class CustomID
		try{
			while(true){
				id.setAndPrintName();	// set name and print it
				id.setAndPrintAge();	// set age and print it
				id.setAndPrintRace();	// set race and print it
				id.initialization();
			}
		} catch (Exception e){
			System.out.println(e.getMessage());	// print what exception is occured
		}
	}
}
