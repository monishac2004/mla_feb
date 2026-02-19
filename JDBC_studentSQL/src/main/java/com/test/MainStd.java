package com.test;

import java.util.List;

public class MainStd {

	public static void main(String[] args) {
		StudentDao sdao = new StudentDao();
		Student std1 = new Student();
		
		std1.setRollNo(2);
		std1.setName("Sanjana");
		std1.setClg("DSCE");
		std1.setCity("Bengalore");
		
		//sdao.saveStudent(std1);
		
		sdao.updateEmployee(std1);
		
		System.out.println("Updated Employee Data.");
		
		List<Student> data = sdao.getAllStudents();
		data.forEach(System.out::println);

	}

}
