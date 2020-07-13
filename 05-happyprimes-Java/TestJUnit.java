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
		assertEquals(new IsHappyNumber().isHappyNumber(2), false);
		assertEquals(new IsHappyNumber().isHappyNumber(23), true);
		assertEquals(new IsHappyNumber().isHappyNumber(1008), false);
		assertEquals(new IsHappyNumber().isHappyNumber(31), true);
		assertEquals(new IsHappyNumber().isHappyNumber(940), false);
		assertEquals(new IsHappyNumber().isHappyNumber(19), true);
		assertEquals(new IsHappyNumber().isHappyNumber(1000), false);
		assertEquals(new IsHappyNumber().isHappyNumber(331), true);
		assertEquals(new IsHappyNumber().isHappyNumber(1418854), false);
		assertEquals(new IsHappyNumber().isHappyNumber(709), true);
		assertEquals(new IsHappyNumber().isHappyNumber(6), false);
		assertEquals(new IsHappyNumber().isHappyNumber(833), true); 
   }

}

