package com.practice.scanner;

import java.util.Scanner;

public class Bill {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Quantity of product: ");
		int quantity=sc.nextInt();
		
		System.out.print("Enter the Price for single quantity: ");
		double price=sc.nextDouble();
		
		System.out.println("You have bought " + quantity + " product of price " + price + " each.");
		System.out.println("Your Total Bill is : " + (quantity*price));
		sc.close();
		
	}

}
//Enter the Quantity of product: 4
//Enter the Price for single quantity: 72.3
//You have bought 4 product of price 72.3 each.
//Your Total Bill is : 289.2
