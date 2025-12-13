package com.practice.scanner;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of 1st side of a triangle: ");
		float side1=sc.nextFloat();
		System.out.print("Enter length of 2nd side of triangle: ");
		float side2=sc.nextFloat();
		System.out.print("Enter length of 3rd side of a triangle: ");
		float side3=sc.nextFloat();
		System.out.println("Perimeter of Triangle is: " + (side1+side2+side3));
		sc.close();
	}

}
//Enter length of 1st side of a triangle: 5
//Enter length of 2nd side of triangle: 6
//Enter length of 3rd side of a triangle: 7
//Perimeter of Triangle is: 18.0

