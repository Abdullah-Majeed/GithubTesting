package lab11;
import java.util.Scanner;
import static org.junit.Assert.*;

import org.junit.Test;

public class EvenIntegerTest {

	@Test
	public void test() {
		Scanner scanner= new Scanner(System.in); 
		System.out.print("Enter number: ");
		int inputNumber= scanner.nextInt();
		NumberCheckerAndCal numberCheckerAndCal = new NumberCheckerAndCal();
		boolean numberChecker = numberCheckerAndCal.evenInteger(inputNumber);
		assertEquals(true,numberChecker);
	}

}
