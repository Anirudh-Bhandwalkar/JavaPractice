package com.practice.overloading;

public class Area {

	public void area(float radius) {
		System.out.println("The Area of Circle : " + (3.14 * radius * radius));
	}

	public void area(float l, float b) {
		System.out.println("The Area of Rectangle is: " + (l * b));
	}

	public static void main(String[] args) {

		Area ar = new Area();
		ar.area(13.5f);
		ar.area(12.3f, 5.2f);
	}

}
