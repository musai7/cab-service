package com.bridgeit.cabservice;

public class CabService {

	public long calculateFare(double distance, int time) throws InvalideUserInputException {

		if(distance<.7 && distance >0)
			return 5;
		if(distance == 0)
			throw new InvalideUserInputException("Enter Valid Distance");
	
		return (long) (distance*10 + time);
	}
}
