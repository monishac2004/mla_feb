package com.test;

import java.util.List;

public class TestDemo {

	public static void main(String[] args) {
		EmpDao edao = new EmpDao();
		Employee emp1 = new Employee();
		
		emp1.setId(5);
		emp1.setName("Madhu");
		emp1.setCmp("DairyDay");
		emp1.setCity("Harohalli");
		
		//edao.saveEmployee(emp1);
		
		edao.updateEmployee(emp1);
		
		System.out.println("Saved Employee Data.");
		
		List<Employee> data = edao.getAllEmployees();
		data.forEach(System.out::println);

	}

}
