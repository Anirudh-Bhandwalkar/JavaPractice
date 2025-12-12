package com.practice.scanner;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Length of Rect : " );
		float length=sc.nextFloat();
		System.out.print("Enter Breadth of Rect : " );
		float breadth=sc.nextFloat();
		
		double area=length*breadth;
		
		System.out.println("Area of Rectangle having length " + length + " and breadth " + breadth + " is " + area);
		sc.close();
		
	}

}
//Enter Length of Rect : 7.2
//Enter Breadth of Rect : 4.6
//Area of Rectangle having length 7.2 and breadth 4.6 is 33.119998931884766
