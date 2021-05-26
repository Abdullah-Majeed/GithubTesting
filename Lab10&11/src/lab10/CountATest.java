package lab10;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountATest {

	@Test
	public void test() {
		JUnitTesting obj=new JUnitTesting();
		int output=obj.countA("zama squad ");
		assertEquals(3, output);
	}

}
