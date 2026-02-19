package com.test;

@FunctionalInterface     
interface FunInf
{
	void draw();
	
	default void dog()
	{
		
	}
	
	static void car()
	{
		
	}
	
}

class Circle implements FunInf
{
	@Override
	public void draw() {
		System.out.println("Circle");
	}
	
	
}

class Square implements FunInf
{
	@Override
	public void draw() {
		System.out.println("Square");
	}
	public Square getObj()
	{
		System.out.println("Object returned");
		return new Square();
	}
}
public class Exp2 {
	
	public static void main(String[] args) {
		Circle obj1 = new Circle();
		obj1.draw();
		
		Square obj2 = new Square();
		obj2.draw();
		
		//Square obj3 = obj2.getObj();
		
		FunInf obj3  = () -> System.out.println("Circle");
		
		obj3.draw();
	}

}
