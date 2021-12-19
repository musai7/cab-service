package com.bridgeit.cabservice;

import java.util.Scanner;

public class CabService {

	public long calculateFare(int key) throws InvalideUserInputException {
		Scanner scanner = new Scanner(System.in);
		int distance, time;
		switch (key) {
		case 1:
			System.out.println("enter distance");
			distance = scanner.nextInt();
			System.out.println("enter time");
			time = scanner.nextInt();
			if (distance < .5 && distance > 0)
				return 5;
			if (distance <= 0)
				throw new InvalideUserInputException("Enter Valid Distance");

			return (long) (distance * 10 + time);
		case 2:

			System.out.println("for multiple rides enter no of ride : ");
			int noOfRides = scanner.nextInt();
			int aggregateFare = 0;
			for (int i = 0; i < noOfRides; i++) {
				System.out.println("enter distance");
				distance = scanner.nextInt();
				System.out.println("enter time");
				time = scanner.nextInt();
				if (distance < .5 && distance > 0) {
					aggregateFare += 5;
					continue;
				}
				if (distance > 0.5) {
					aggregateFare += (distance * 10 + time);
					continue;
				}else
					throw new InvalideUserInputException("Enter Valid Distance");
			}
			return aggregateFare;
		default:
			break;
		}
		return key;
	}
}