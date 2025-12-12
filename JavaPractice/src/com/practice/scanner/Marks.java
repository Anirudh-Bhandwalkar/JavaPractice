package com.practice.scanner;

import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		int sum=0,marks=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter marks for 5 subjects");
		for(int i=1;i<=5;i++)
		{
			marks=sc.nextInt();
			sum += marks;
		}
		System.out.println("Total Marks scored : " + sum);
		double percentage=((sum)*100)/500;
		System.out.println("Percentage : " + percentage);
		sc.close();
		
		
	
	}
	

}
//Enter marks for 5 subjects77
//71
//89
//73
//64
//Total Marks scored : 374
//Percentage : 74.0

