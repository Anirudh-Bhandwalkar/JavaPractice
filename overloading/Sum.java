package com.practice.overloading;

public class Sum {

	public void sum(int a, int b) {
		System.out.println("Sum is : " + (a + b));

	}
	
	public void sum(float a,float b)
	{
		System.out.println("Sum is : " + (a +b));
	}
	
	public static void main(String[] args) {
		
		Sum s=new Sum();
		s.sum(5, 10);
		s.sum(23.2f, 32.6f);
	}

}
