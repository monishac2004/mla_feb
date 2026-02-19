package com.test.fls;

import java.io.Serializable;

public class Employee implements Serializable{
	private static final long serialVersionUID = 1L;
	public int id = 101;
	public String name = "Rohit";
	public String cmp = "Mphasis";
	public transient int pin = 560048;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", cmp=" + cmp + "]";
	}
}