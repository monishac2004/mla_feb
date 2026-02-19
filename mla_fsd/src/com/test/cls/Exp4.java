 package com.test.cls;
 
 import java.util.TreeMap;

public class Exp4 {
	
	public static void main(String[] args) {
		
		TreeMap<String, Integer>data = new TreeMap<>();
		
		data.put("Sony", 330);
		data.put("lenova", 320);
		data.put("dell", 200);
		data.put("Sony", 5050);
		data.put("aple", 350);
		data.put("dell", 400);
		data.put("asus", 11);
		
		data.forEach((k,v) -> System.out.println(k+ " : "+v));
		
		System.out.println(data.get("Sony"));
	}

}
