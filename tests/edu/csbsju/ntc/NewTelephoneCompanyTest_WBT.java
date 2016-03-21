package edu.csbsju.ntc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NewTelephoneCompanyTest_WBT {
	private NewTelephoneCompany ntc;
	private double charge;
	@Before
	public void setUp() throws Exception {
		ntc = new NewTelephoneCompany();
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testComputeChargeInvalidStartTime_case1 () {
		ntc.setStartTime(-5);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testComputeChargeInvalidStartTime_case2 () {
		ntc.setStartTime(-1);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testComputeChargeInvalidStartTime_case3 () {
		ntc.setStartTime(2544);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testComputeChargeInvalidStartTime_case4 () {
		ntc.setStartTime(2400);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
		
	@Test(expected = UnsupportedOperationException.class)
	public void testComputeChargeInvalidStartTime_case5 () {
		ntc.setStartTime(2401);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testComputeChargeInvalidStartTime_case6 () {
		ntc.setStartTime(1578);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testComputeChargeInvalidStartTime_case7 () {
		ntc.setStartTime(1160);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testComputeChargeInvalidStartTime_case8 () {
		ntc.setStartTime(1161);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testComputeChargeInvalidStartTime_case9 () {
		ntc.setStartTime(799);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testComputeChargeInvalidDuration_case1 () {
		ntc.setStartTime(1800);
		ntc.setDuration(0);
		ntc.computeCharge();
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testComputeChargeInvalidDuration_case2 () {
		ntc.setStartTime(1800);
		ntc.setDuration(-1);
		ntc.computeCharge();
	}
	
	@Test
	public void testComputeChargeDiscountedStartTimeAndDuration_case1 () {
		ntc.setStartTime(500);
		ntc.setDuration(100);
		charge = ntc.computeCharge();
		assertTrue("Charge should be equal to 1768", charge == 1768.0);
	}
	
	@Test
	public void testComputeChargeDiscountedStartTimeAndDuration_case2 () {
		ntc.setStartTime(759);
		ntc.setDuration(61);
		charge = ntc.computeCharge();
		assertTrue("Charge should be equal to 1078.48", charge == 1078.48);
	}
	
	@Test
	public void testComputeChargeDiscountedStartTimeAndDuration_case3 () {
		ntc.setStartTime(1959);
		ntc.setDuration(61);
		charge = ntc.computeCharge();
		assertTrue("Charge should be equal to 1078.48", charge == 1078.48);
	}
	
	@Test
	public void testComputeChargeDiscountedStartTimeAndDuration_case4 () {
		ntc.setStartTime(2359);
		ntc.setDuration(65);
		charge = ntc.computeCharge();
		assertTrue("Charge should be equal to 1149.20", charge == 1149.20);
	}
	
	@Test
	public void testComputeChargeDiscountedStartTimeOnly_case1 () {
		ntc.setStartTime(0);
		ntc.setDuration(60);
		charge = ntc.computeCharge();
		assertTrue("Charge should be equal to 1248.0", charge == 1248.0);
	}
	
	@Test
	public void testComputeChargeDiscountedStartTimeOnly_case2 () {
		ntc.setStartTime(400);
		ntc.setDuration(59);
		charge = ntc.computeCharge();
		assertTrue("Charge should be equal to 1227.2", charge == 1227.2);
	}
	
	@Test
	public void testComputeChargeDiscountedStartTimeOnly_case3 () {
		ntc.setStartTime(759);
		ntc.setDuration(1);
		charge = ntc.computeCharge();
		assertTrue("Charge should be equal to 20.8", charge == 20.8);
	}
	
	@Test
	public void testComputeChargeDiscountedStartTimeOnly_case4 () {
		ntc.setStartTime(1800);
		ntc.setDuration(10);
		charge = ntc.computeCharge();
		assertTrue("Charge should be equal to 208.0", charge == 208.0);
	}
	
	@Test
	public void testComputeChargeDiscountedStartTimeOnly_case5 () {
		ntc.setStartTime(1801);
		ntc.setDuration(10);
		charge = ntc.computeCharge();
		assertTrue("Charge should be equal to 208.0", charge == 208.0);
	}
	
	@Test
	public void testComputeChargeDiscountedStartTimeOnly_case6 () {
		ntc.setStartTime(2359);
		ntc.setDuration(10);
		charge = ntc.computeCharge();
		assertTrue("Charge should be equal to 208.0", charge == 208.0);
	}
	
	@Test
	public void testComputeChargeDiscountedDurationOnly_case1 () {
		ntc.setStartTime(800);
		ntc.setDuration(65);
		charge = ntc.computeCharge();
		assertTrue("Charge should be equal to 2298.4", charge == 2298.4);
	}
	
	@Test
	public void testComputeChargeDiscountedDurationOnly_case2 () {
		ntc.setStartTime(900);
		ntc.setDuration(61);
		charge = ntc.computeCharge();
		assertTrue("Charge should be equal to 2156.96", charge == 2156.96);
	}
	
	@Test
	public void testComputeChargeNoDiscount_case1 () {
		ntc.setStartTime(1000);
		ntc.setDuration(40);
		charge = ntc.computeCharge();
		assertTrue("Charge should be equal to 1664.0", charge == 1664.0);
	}
	
	@Test
	public void testComputeChargeNoDiscount_case2 () {
		ntc.setStartTime(800);
		ntc.setDuration(1);
		charge = ntc.computeCharge();
		assertTrue("Charge should be equal to 41.60", charge == 41.60);
	}
	
	@Test
	public void testComputeChargeNoDiscount_case3 () {
		ntc.setStartTime(801);
		ntc.setDuration(59);
		charge = ntc.computeCharge();
		assertTrue("Charge should be equal to 2454.4", charge == 2454.4);
	}
	
	@Test
	public void testComputeChargeNoDiscount_case4 () {
		ntc.setStartTime(1759);
		ntc.setDuration(60);
		charge = ntc.computeCharge();
		assertTrue("Charge should be equal to 2496.0", charge == 2496.0);
	}
}
