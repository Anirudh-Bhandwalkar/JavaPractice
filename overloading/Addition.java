package com.practice.overloading;

public class Addition {
	
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		
		Addition add=new Addition();
		add.add(21, 25);
		add.add(1, 2, 3);
	}

}
