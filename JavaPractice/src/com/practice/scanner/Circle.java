package com.practice.scanner;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Radius of circle to find area");
		float radius=sc.nextFloat();
		
		double area=3.14 * radius * radius;
		System.out.println("Area of circle with radius " + radius + " is " + area);
		sc.close();
	}

}

//Enter the Radius of circle to find area
//7.5
//Area of circle with radius 7.5 is 176.625
