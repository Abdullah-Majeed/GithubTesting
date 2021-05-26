package lab10;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinIntegerTest {

	@Test
	public void test() {
		int integrArray [] = {1,2,3,4,5,6,7,8,9};
		MaxAndMinCalculation calculation = new MaxAndMinCalculation();
		int maxIntegerNumber = calculation.minInteger(integrArray);
		assertEquals(1,maxIntegerNumber);
	}

}
