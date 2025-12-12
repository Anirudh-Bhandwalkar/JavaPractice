package com.practice.scanner;

import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number to add: " );
		int num1=sc.nextInt();
		System.out.println("Enter second number to add : ");
		int num2=sc.nextInt();
	
		System.out.println("Addition of " + num1 + " and " + num2 + " is " +(num1+num2) );
		sc.close();
	}

}
