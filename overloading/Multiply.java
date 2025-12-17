package com.practice.overloading;

public class Multiply {
	public void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	
	public void mul(double a,double b)
	{
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		Multiply m=new Multiply();
		m.mul(23, 5);
		m.mul(6546.5, 23.2);
	}
}
