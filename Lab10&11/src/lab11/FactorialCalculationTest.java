package lab11;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class FactorialCalculationTest {

	@Test
	public void test() {
		Scanner scanner= new Scanner(System.in); 
		System.out.print("Enter number: ");
		int inputNumber= scanner.nextInt();
		NumberCheckerAndCal numberCheckerAndCal = new NumberCheckerAndCal();
		int numberChecker = numberCheckerAndCal.factorial(inputNumber);
		assertEquals(120,numberChecker);
	}

}
