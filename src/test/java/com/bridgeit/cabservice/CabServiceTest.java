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
		long expectedFare = scanner.nextLong();

		assertEquals(expectedFare, actualFare);
	}

	@Test
	public void testCalculateFare_should_return_minFare() throws InvalideUserInputException {

		long actualFare = cabService.calculateFare(1);
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
	public void testCalculateMultipleRidesAggregateFare() {
		long actualFare =0;
		try {
			actualFare = cabService.calculateFare(2);
			long expectedFare = scanner.nextLong();
			assertEquals(expectedFare, actualFare);
		} catch (InvalideUserInputException e) {
			e.printStackTrace();
		}
	}
}
