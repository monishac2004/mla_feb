package com.test.voter;

public class AgeValidationException extends RuntimeException
{
	public static final long serialVersionID = 1L;
	public AgeValidationException(String msg) {
		super(msg);
	}

}
