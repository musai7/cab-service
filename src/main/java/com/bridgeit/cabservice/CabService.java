package com.bridgeit.cabservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;

public class CabService {

	public long calculateFare(int key) throws InvalideUserInputException {
		Scanner scanner = new Scanner(System.in);
		int distance, time, noOfRides;
		int aggregateFare = 0;
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
			noOfRides = scanner.nextInt();
			aggregateFare = 0;
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
				} else
					throw new InvalideUserInputException("Enter Valid Distance");
			}
			return aggregateFare;
		case 3:
			System.out.println("for multiple rides enter no of ride : ");
			noOfRides = scanner.nextInt();
			aggregateFare = 0;
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
				} else
					throw new InvalideUserInputException("Enter Valid Distance");
			}
			return aggregateFare/noOfRides;
		case 4:
			Map<Integer, List<Integer>> cabInvoiceMap = new HashMap<>();
			cabInvoiceMap.put(1, Arrays.asList(50,25,30,40,50,10));
			cabInvoiceMap.put(2, Arrays.asList(20,15,60,12,42,65,75));
			cabInvoiceMap.put(3, Arrays.asList(26,40,11,31,25,65,75,68,5));
			cabInvoiceMap.put(4, Arrays.asList(10,12,50,22,25,36,45,16));
			cabInvoiceMap.put(5, Arrays.asList(16,25,10,5,65,99,58,62,25,12));
			cabInvoiceMap.put(6, Arrays.asList(55,65,25,14,40,30,26,65));
			 System.out.println("enter user id : ");
			 Integer uid = scanner.nextInt();
			 int index=-1;
			 int avgFare=0;
			 if(cabInvoiceMap.containsKey(uid)) {
				 Iterator<Integer> iterator = cabInvoiceMap.get(uid).iterator();
				 while(iterator.hasNext()) {
					 index++;
					 if(index==cabInvoiceMap.get(uid).size()) {
						 break;
					 }
					 avgFare += cabInvoiceMap.get(uid).get(index);
				 }
			 }
			return avgFare;
		default:
			break;
		}
		return key;
	}
}