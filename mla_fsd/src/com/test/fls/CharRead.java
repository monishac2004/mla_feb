package com.test.fls;

import java.io.FileReader;
import java.io.BufferedReader;

public class CharRead {

	public static void main(String[] args) throws Exception {
		
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new FileReader("src/ct.txt"));
		
		System.out.println(br.readLine());
		
	}

}
