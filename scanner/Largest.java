package com.practice.scanner;

import java.util.Scanner;

public class Largest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number to check : ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number to check : ");
		int num2 = sc.nextInt();
		System.out.println("Enter 3rd number to check : ");
		int num3 = sc.nextInt();

		if (num1 > num2 && num1!=num2) {
			if(num1 > num3) {
				System.out.println(num1 + "is greater than " + num2 + " and " + num3);
			} else {
				System.out.println(num3 + " is greatest");
			}
		}
			else
			{
			if(num2<num3 && num2!=num3)
					{
				System.out.println(num2 + " is greatest");
					}
				else
				{
					System.out.println(num3 +  " is greatest");
				}
			
		}
		sc.close();

	}

}

