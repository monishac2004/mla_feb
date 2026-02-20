package com.test;

import java.util.List;

public class CustDemo {

	public static void main(String[] args) {
		
		CustDao cdao = new CustDao();
		
		Customer cst = new Customer();
		
		cst.setC_id(2);
		cst.setC_name("mon");
		cst.setC_city("bombay");
		
		//cdao.saveCustomer(cst);
		
		//cdao.updateCustomer(cst);
		
		cdao.deleteCustomer(cst);
		//List<Customer> list= cdao.getAllCustomers();
		
		//list.forEach(System.out::println);
	}

}
