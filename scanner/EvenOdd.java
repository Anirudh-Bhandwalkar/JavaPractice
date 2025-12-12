package com.practice.scanner;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to check : ");
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println( num + " is Even");
		}
		else
		{
			System.out.println(num + " is Odd");
		}
		sc.close();
		
	}

}
//Enter a number to check : 14
//14 is Even

//Enter a number to check : 7
//7 is Odd
