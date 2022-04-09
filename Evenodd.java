package stringprogram;

import java.util.Scanner;

public class Evenodd {
	
	public static void main(String[] args) {
		
		//The Scanner class is used to get user input, and it is found in the java. util package
		//The System.in parameter is used to take input from the standard input. It works just like taking inputs from the keyboard.
		Scanner scr = new Scanner(System.in);
		System.out.println("enter no.");
		int num = scr.nextInt();
		
		if(num % 2==0) 
			System.out.println(num +" is even");
		else
			System.out.println(num +  " is odd");
		}
	
}
	       
	    
	
		
		
	


