package com.practice.scanner;

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check : ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println(num + " is Positive");
		} else if (num < 0) {
			System.out.println(num + " is Negative");
		} else {
			System.out.println(num + " is Zero");
		}
		sc.close();
	}

}
//Enter a number to check : -5
//-5 is Negative

//Enter a number to check : 0
//0 is Zero
