package com.practice.scanner;

import java.util.Scanner;

public class MulDiv {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter 1st number to calculate : ");
	int num1=sc.nextInt();
	System.out.print("Enter 2nd number to calculate : ");
	int num2=sc.nextInt();
	
	System.out.println("Multiplication of " + num1 + " and "+ num2 + " is " + (num1*num2));
	System.out.println("Division of " + num1 + " and " + num2 + " is " + (num1/num2));
	sc.close();

}
}
