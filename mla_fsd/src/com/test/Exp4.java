package com.test;

public class Exp4 {
	
	public static void main(String[] args) {
	try {
		System.out.println(11/6);
		
		System.out.println("coders");
		
		String name = "Java";
		
		System.out.println(name.charAt(1));
		
		int[] arr = {2,3,4,5,6};
		
		System.out.println(arr[2]);
		
	}
	catch(Exception e)
	{
		System.out.println("Try again");
		System.exit(0);
		
		
	}
	
	finally {
		System.out.println("final");
	}

	}
	
	
	


}
