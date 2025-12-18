package com.practice.overriding;

public class Pnb extends Bank{

	@Override
	public void getInterest() {
		System.out.println("Interest Rate is 5.2 %");
	}
	@Override
	public void minBalance() {
		System.out.println("Should have min Balance 2000");
	}
	public void ourOffer() {
		System.out.println("Get Car Loan at Lowest Interest Rate...");
	}
	
	public static void main(String[] args) {
	
	Bank b=new Bank();
	b.getInterest();
	b.minBalance();
	b.ruleBook();
	Pnb p=new Pnb();
	p.getInterest();
	p.minBalance();
	p.ourOffer();
		
	}
}
