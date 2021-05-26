package lab11;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ EvenIntegerTest.class, FactorialCalculationTest.class, OddIntegerTest.class, PrimeIntegerTest.class })
public class AllTests {

}
