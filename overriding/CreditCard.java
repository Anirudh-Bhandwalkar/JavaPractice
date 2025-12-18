package com.practice.overriding;

import java.util.Scanner;

public class CreditCard extends Payment {

	boolean isFullamount;
	@Override
	public void payment(double amount) {
//		this.isFullamount=isFullamount;
		System.out.println("Payment through credit card ");
		if (this.isFullamount == true) {
			System.out.println("Paying " + amount + " at one time...");
		} else {
			System.out.println("Paying " + amount + "  in EMI's");
		}
	}

	public void emi(int time) {
		switch(time)
		{
		case 3:System.out.println("Your monthly emi is : " + (5100/3)*((5100/100)*5.5));
		break;
		case 6:System.out.println("Your monthly emi is : " + (5100/6)*((5100/100)*6.3));
		break;
		case 12:System.out.println("Your monthly emi is : " + (5100/12)*((5100/100)*7.2));
		break;
		default : System.out.println("Invalid Time Period !!!");
		}
		

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Total Amount : ");
		double amount = sc.nextDouble();
		System.out.print("Are You Paying the Full Amount : ");
		boolean isFullamount = sc.nextBoolean();
		CreditCard cd = new CreditCard();
		cd.payment(amount);
		if (isFullamount == false) {
			System.out.print("Choose EMI Period :");
			int time=sc.nextInt();
			cd.emi(time);
			
		}
	}
}
