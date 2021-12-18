package com.bridgeit.cabservice;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class CabServiceTest {

	static CabService cabService;

	@BeforeClass
	public static void getInstance() {
		cabService = new CabService();
	}

	@Test
	public void testCalculateFare_should_return_TotalFare() throws InvalideUserInputException {

		double distance = 7.5; // 1 km fare is 10Rs
		int time = 30; // 1 min fare 1 Re
		long actualFare = cabService.calculateFare(distance, time);
		long expectedFare = 105;

		assertEquals(expectedFare, actualFare);
	}

	@Test
	public void testCalculateFare_should_return_minFare() throws InvalideUserInputException {

		double distance = .6; // 1 km fare is 10Rs
		int time = 1; // 1 min fare 1 Re
		long actualFare = cabService.calculateFare(distance, time);
		long expectedFare = 5;

		assertEquals(expectedFare, actualFare);
	}

	@SuppressWarnings("unused")
	@Test
	public void testCalculateFare_should_return_zeroFare() {

		double distance = 0; // 1 km fare is 10Rs
		int time = 0; // 1 min fare 1 Re
		long actualFare;
		try {
			actualFare = cabService.calculateFare(distance, time);
		} catch (InvalideUserInputException e) {
			e.printStackTrace();
		}
	}
}
