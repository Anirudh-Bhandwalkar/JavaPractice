package com.practice.overriding;

import java.util.Scanner;

public class Accountant extends Company {

	@Override
	public void monthlySalary(double salary) {
		System.out.println("Your salary is : " + salary);
		System.out.println("Your Yearly Salary comes out to be : " + (12 * salary));

	}

	@Override
	public void getExperience(float exp) {
		System.out.println("Your Work Experience is : " + exp);

	}

	@Override
	public void value(double salary, float exp) {
		if ((exp >= 0 && exp <= 2) && (salary >= 12000 && salary <= 18000)) {
			System.out.println("You are well paid");
		} else if ((exp > 2 && exp <= 5) && (salary > 18000 && salary <= 27000)) {
			System.out.println("You are well paid");
		}

		else {
			System.out.println("You are not well paid");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Company c=new Company();
		Accountant a=new Accountant();
		System.out.print("Enter Your Experience: ");
		float exp=sc.nextFloat();
		System.out.print("Enter your Salary : ");
		double salary=sc.nextDouble();
		
//		c.getExperience(exp);
		a.getExperience(exp);
//		c.monthlySalary(salary);
		a.monthlySalary(salary);
		a.value(salary, exp);
		sc.close();
		
	}

}
