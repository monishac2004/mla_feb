package com.test.voter;

public class Datavalidator {
	public void checkAge(int age) {
		if(age >= 18)
		{
			throw(new AgeValidationException("Valid"));
		}
		else {
			throw(new AgeValidationException("Invalid"));
		}
	}
}
