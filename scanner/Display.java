package com.practice.scanner;

import java.util.Scanner;

public class Display {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name" );
		String name=sc.nextLine();
		System.out.println("Enter Your Age");
		int age=sc.nextInt();
		
		System.out.println("\n");
		System.out.println("The Name you entered is: " + name);
		System.out.println("Age is: " + age);
		sc.close();
		
	}

}
