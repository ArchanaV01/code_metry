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
      	assertEquals(new NthPowerfulNumber().nthPowerfulNumber(53), 1000);
		assertEquals(new NthPowerfulNumber().nthPowerfulNumber(39), 576);
		assertEquals(new NthPowerfulNumber().nthPowerfulNumber(29), 343);
		assertEquals(new NthPowerfulNumber().nthPowerfulNumber(17), 128);
		assertEquals(new NthPowerfulNumber().nthPowerfulNumber(18), 144);
		assertEquals(new NthPowerfulNumber().nthPowerfulNumber(19), 169);
		assertEquals(new NthPowerfulNumber().nthPowerfulNumber(4), 16);
		assertEquals(new NthPowerfulNumber().nthPowerfulNumber(5), 25);
		assertEquals(new NthPowerfulNumber().nthPowerfulNumber(6), 27);
		assertEquals(new NthPowerfulNumber().nthPowerfulNumber(7), 32);
		assertEquals(new NthPowerfulNumber().nthPowerfulNumber(8), 36);
		assertEquals(new NthPowerfulNumber().nthPowerfulNumber(9), 49);
		assertEquals(new NthPowerfulNumber().nthPowerfulNumber(10), 64);
		assertEquals(new NthPowerfulNumber().nthPowerfulNumber(0), 1);
   }

}

