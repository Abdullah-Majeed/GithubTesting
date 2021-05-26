package lab11;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class PrimeIntegerTest {

	@Test
	public void test() {
		Scanner scanner= new Scanner(System.in); 
		System.out.print("Enter number: ");
		int inputNumber= scanner.nextInt();
		NumberCheckerAndCal numberCheckerAndCal = new NumberCheckerAndCal();
		boolean numberChecker = numberCheckerAndCal.primeInteger(inputNumber);
		assertEquals(true,numberChecker);
	}

}
