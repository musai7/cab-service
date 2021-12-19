package com.bridgeit.cabservice;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.BeforeClass;
import org.junit.Test;

public class CabServiceTest {

	static CabService cabService;
	Scanner scanner = new Scanner(System.in);

	@BeforeClass
	public static void getInstance() {
		cabService = new CabService();
	}

	@Test
	public void testCalculateFare_should_return_TotalFare() throws InvalideUserInputException {

		long actualFare = cabService.calculateFare(1);
		System.out.println("enter expexted fare : ");
		long expectedFare = scanner.nextLong();

		assertEquals(expectedFare, actualFare);
	}

	@Test
	public void testCalculateFare_should_return_minFare() throws InvalideUserInputException {

		long actualFare = cabService.calculateFare(1);
		System.out.println("enter expexted fare : ");
		long expectedFare = scanner.nextLong();

		assertEquals(expectedFare, actualFare);
	}

	@Test
	public void testCalculateFare_should_return_zeroFare() {

		try {
			cabService.calculateFare(1);
		} catch (InvalideUserInputException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testCalculate_MultipleRides_should_return_AggregateFare() {
		long actualFare =0;
		try {
			actualFare = cabService.calculateFare(2);
			System.out.println("enter expexted aggregate fare : ");
			long expectedAggregateFare = scanner.nextLong();
			assertEquals(expectedAggregateFare, actualFare);
		} catch (InvalideUserInputException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testCalculate_MultipleRides_shouldReturn_Avarage_Fare() {
		long actualFare =0;
		try {
			actualFare = cabService.calculateFare(3);
			System.out.println("enter expexted avg fare : ");
			long expectedAvgFare = scanner.nextLong();
			assertEquals(expectedAvgFare, actualFare);
		} catch (InvalideUserInputException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testCalculate_By_UserId_shouldReturn_AvgFare() {
		long actualFare =0;
		try {
			actualFare = cabService.calculateFare(4);
			System.out.println("enter expexted avg fare : ");
			long expectedAvgFare = scanner.nextLong();
			assertEquals(expectedAvgFare, actualFare);
		} catch (InvalideUserInputException e) {
			e.printStackTrace();
		}
	}
}
