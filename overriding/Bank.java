package com.practice.overriding;

public class Bank {
	public void getInterest()
	{
		System.out.println("This is the Message from Parent Bank RBI" );
	}
	public void minBalance() {
//		System.out.println("Should have minimum balance ..!!!");
	}
	
	public void ruleBook()
	{
		System.out.println("Interest Rate should range between 4.5-7.3%");
		System.out.println("No Hidden Fees/Charges");
		System.out.println("Be Aware from fake msgs");
	}

}
