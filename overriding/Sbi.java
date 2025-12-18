package com.practice.overriding;

public class Sbi extends Bank{

	@Override
	public void getInterest() {
		super.getInterest();
		System.out.println("Interest Rate is 5.7%");
	}
		public void ourOffer()
		{
			System.out.println("Get Instant Home Loan with Interest 11%");
		}
	public static void main(String[] args) {
		
		Sbi s=new Sbi();
		s.getInterest();
		s.ourOffer();
	}
}
