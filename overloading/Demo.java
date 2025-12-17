package com.practice.overloading;

public class Demo {
	
	public void show(int id,String name)
	{
		System.out.println("Student Name: " + name);
		System.out.println("Student Id:" + id);
	}
	 public void show(String div , int std)
	 {
		 System.out.println("Student Division is : " + div);
		 System.out.println("Student Std is : " + std);
	 }

	 
	 public static void main(String[] args) {
		
		 Demo d=new Demo();
		 d.show(5, "Anirudh");
		 d.show("B", 15);
		 System.out.println("\n");
		 d.show(53, "Nikhil");
		 d.show("A", 15);
		 
	}
}
