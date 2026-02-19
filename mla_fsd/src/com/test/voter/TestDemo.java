package com.test.voter;

import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age");
		
		int age = sc.nextInt();
		
		Datavalidator obj = new Datavalidator();
		
		obj.checkAge(age);
	}

}
