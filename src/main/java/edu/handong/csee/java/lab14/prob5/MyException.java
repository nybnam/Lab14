package edu.handong.csee.java.lab14.prob5;

public class MyException extends Exception {
	private String message = null;	// variable to save exception's message
	 
    public MyException() {
        super(); // inheriting constructor
    }
 
    public MyException(String message) {
        super(message); // inheriting constructor
        this.message = message; // set this.message to message
    }

    public String toString() {
        return message; // return string message
    }
}
