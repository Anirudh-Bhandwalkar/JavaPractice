package com.practice.scanner;

import java.util.Scanner;

public class Concat {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st String: ");
		String str1=sc.nextLine();
		System.out.print("Enter 2nd String: ");
		String str2=sc.nextLine();
		
		String concate=str1 + str2;
		System.out.println("Concatenated String is: " + concate);
		sc.close();
	}

}
