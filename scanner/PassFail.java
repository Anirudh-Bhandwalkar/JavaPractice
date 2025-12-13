package com.practice.scanner;

import java.util.Scanner;

public class PassFail {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter ur marks to check: ");
		float marks=sc.nextFloat();
		
		if(marks<35)
		{
			System.out.println("Tu Fail Hogaya.....!!!!");
		}
		else
		{
			System.out.println("Pass Hogaya.....");
		}
		sc.close();
	}

}
