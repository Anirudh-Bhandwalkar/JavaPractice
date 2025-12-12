package com.practice.scanner;

import java.util.Scanner;

public class Thought {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Write any Thought : ");
		String tht=sc.nextLine();
		
		System.out.println("Your Thought is " + tht);
		sc.close();
		
	}

}
//Write any Thought : Old is Gold
//Your Thought is Old is Gold
