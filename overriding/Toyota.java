package com.practice.overriding;

import java.util.Scanner;

public class Toyota extends Cars {
	
	@Override
	public void carType(String type)
	{
		if(type.equals("Hatchback") || type.equals("Sedan"))
		{
			System.out.println("Seating capacity of 5");
		}
		else if(type.equals("SUV"))
		{
			System.out.println("Seating Capacity of 7");
		}
		else
		{
			System.out.println("Can't Identify type");
		}
		
	}
	
	@Override
	public void carMileage(String type) {
		if(type.equals("Hatchback") || type.equals("Sedan"))
		{
			System.out.println("Mileage can be from 15-18");
		}
		else if(type.equals("SUV"))
		{
			System.out.println("Milegae can range in 10-13");
		}
		else
		{
			System.out.println("Can't Identify type");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Car Type : ");
		String type=sc.nextLine();
		
		Toyota t=new Toyota();
		t.carType(type);
		t.carMileage(type);
		sc.close();
	}

}
