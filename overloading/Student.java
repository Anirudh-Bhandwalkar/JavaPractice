package com.practice.overloading;

public class Student {
	int id;
	String name;
	
	Student(){
		id=1;
		name="Anirudh";
	}
	
	Student(int id)
	{
		this.id=id;
	}
	Student(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	public void display()
	{
		System.out.println("ID : " + id +"\n Name : " + name );
	}
	public static void main(String[] args) {
		Student std1=new Student();
		Student std2=new Student(2);
		Student std3=new Student(5,"Anirudh");
		
		std1.display();
		std2.display();
		std3.display();
		
	}

}
