package edu.handong.csee.java.lab14.prob4;
import java.util.Scanner;

public class Boundary {
	private int arr[];
	
	public void setArray(int a[]){
		arr = a;
	}
	
	public void numberToArray(int n, int num){
		arr[n] = num;
		System.out.println("arr[" + n + "] <- " + arr[n]);
	}
}
