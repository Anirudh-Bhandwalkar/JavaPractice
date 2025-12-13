package com.practice.scanner;

import java.util.Scanner;

public class SquareCube {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to find its square and cube: ");
		int num=sc.nextInt();
		int square=num*num;
		int cube=num*num*num;
		System.out.println("Square of " + num + " is : " + square);
		System.out.println("Cube of " + num + " is : " + cube);
		sc.close();
		
	
	}
}
//Enter a number to find its square and cube: 50
//Square of 50 is : 2500
//Cube of 50 is : 125000