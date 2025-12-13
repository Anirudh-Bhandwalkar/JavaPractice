package com.practice.scanner;

import java.util.Scanner;

public class Temp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Temperature in Celsius to get in Farenheit : ");
		int c=sc.nextInt();
		
		double f=((9.0/5.0)*c)+32;
		
		System.out.println("Temperature in Farenheit is : " + f);
		sc.close();
		
	}

}
//Enter Temperature in Celsius to get in Farenheit : 32
//Temperature in Farenheit is : 89.6
