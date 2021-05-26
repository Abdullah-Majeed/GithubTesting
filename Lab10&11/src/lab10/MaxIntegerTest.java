package lab10;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxIntegerTest {

	@Test
	public void test() {
		int integrArray [] = {1,2,3,4,5,6,7,8,9};
		MaxAndMinCalculation calculation = new MaxAndMinCalculation();
		int maxIntegerNumber = calculation.maxInteger(integrArray);
		assertEquals(9,maxIntegerNumber);
		
	}

}
