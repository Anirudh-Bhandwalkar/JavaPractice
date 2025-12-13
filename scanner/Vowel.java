package com.practice.scanner;

import java.util.Scanner;

public class Vowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a single Alphabet to check: ");
		String alpha=sc.nextLine();
		
		if(alpha=="a" || alpha=="A" || alpha=="e" || alpha=="E" || alpha=="i" || alpha=="I" || alpha=="o" || alpha=="O" || alpha=="u" || alpha=="U")
		{
			System.out.println("Given Alphabet " + alpha + " is a Vowel");
		}
		else
		{
			System.out.println("Given Alphabet " + alpha + " is a Consonant");
		}
		sc.close();
	}

}
