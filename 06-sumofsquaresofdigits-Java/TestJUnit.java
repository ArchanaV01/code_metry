/**
 * This is JUnit that tests the sleepIn method that is available in SleepIn class.
 * This contains 4 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and paste the last three 
 * lines of the code (TestCase4).
 * 
 * @author: Siva Sankar
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
		assertEquals(new SumOfSquaresOfDigits().sumOfSquaresOfDigits(5), 25);
		assertEquals(new SumOfSquaresOfDigits().sumOfSquaresOfDigits(12), 5);
		assertEquals(new SumOfSquaresOfDigits().sumOfSquaresOfDigits(234), 29);
		assertEquals(new SumOfSquaresOfDigits().sumOfSquaresOfDigits(234101), 31);
		assertEquals(new SumOfSquaresOfDigits().sumOfSquaresOfDigits(2340), 29);
		assertEquals(new SumOfSquaresOfDigits().sumOfSquaresOfDigits(10), 1);
		assertEquals(new SumOfSquaresOfDigits().sumOfSquaresOfDigits(12012), 10);
		assertEquals(new SumOfSquaresOfDigits().sumOfSquaresOfDigits(1), 1);
		assertEquals(new SumOfSquaresOfDigits().sumOfSquaresOfDigits(0), 0);
   }

}

