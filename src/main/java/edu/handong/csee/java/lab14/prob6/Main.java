package edu.handong.csee.java.lab14.prob6;

public class Main {
	public static void main(String[] args){
		CustomID id = new CustomID();
		while(true){
			try{
				id.setAndPrintName();
				id.setAndPrintAge();
				id.setAndPrintRace();
				break;
			} catch (Exception e){
				System.out.println(e.getMessage());
			}
		}
	}
}
