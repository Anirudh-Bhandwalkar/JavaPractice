package com.practice.scanner;

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Employee ID: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Employee Name: ");
		String name=sc.nextLine();
		System.out.print("Enter your Salary: ");
		double salary=sc.nextDouble();
		
		System.out.println("--------Employee Details--------");
		System.out.println("Employee ID: " + id);
		System.out.println("Employee Name: " + name);
		System.out.println("Salary: " + salary);
		sc.close();
	}

}
//Enter Employee ID: 5
//Enter Employee Name: Anirudh
//Enter your Salary: 42364.23
//--------Employee Details--------
//Employee ID: 5
//Employee Name: Anirudh
//Salary: 42364.23