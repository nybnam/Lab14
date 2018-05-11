package edu.handong.csee.java.lab14.prob4;
import java.util.Scanner;

public class Boundary {
	private int arr[];	// array to save integer
	
	public void setArray(int a[]){
		arr = a;	// initialize arr
	}
	
	public void numberToArray(int n, int num){
		arr[n] = num;	// set num to array's member
		System.out.println("arr[" + n + "] <- " + arr[n]); // print that input num to array successfully
	}
}
