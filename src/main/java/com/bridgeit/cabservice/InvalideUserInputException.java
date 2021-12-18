package com.bridgeit.cabservice;

public class InvalideUserInputException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public InvalideUserInputException(String message) {
		super(message);
	}
}
