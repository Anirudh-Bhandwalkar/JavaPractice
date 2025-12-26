package com.mock;

import java.util.Scanner;

public class Prime {

	public  boolean isPrime(int n) {
		if (n <= 2)
			return false;
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		Prime p=new Prime();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 3 numbers to check prime and to get their addition");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		boolean ans=p.isPrime(num1) || p.isPrime(num2) || p.isPrime(num3);
		if(ans==true)
		{
			
			System.out.println("Addition is : " + (num1 + num2 + num3));
		}
		else
			System.out.println("None of the given numbers are Prime...!");
		

	}

}
