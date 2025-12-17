package com.practice.overloading;

public class Print {
	public int display(int a)
	{
	return a;	
	}
	
	public String display(String name)
	{
		return "My name is: " + name;
		
	}
	
	public static void main(String[] args) {
		
		Print p=new Print();
		System.out.println(p.display(4));
		System.out.println(p.display("Anirudh"));
	}

}
