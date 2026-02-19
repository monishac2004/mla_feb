package com.test.fls;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.BufferedOutputStream;

public class ByteWrite {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("src/emt.text");
		FileOutputStream fos = new FileOutputStream(file);
		/*
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		String msg = "This is simple byte stream write and read operation";
		
		bos.write(msg.getBytes());
		
		bos.flush();
		*/
		
		ObjectOutputStream obj = new ObjectOutputStream(fos);
		
		Employee emp = new Employee();
		
		obj.writeObject(emp);
		
		System.out.println("Done.");
		
		
	}

}
