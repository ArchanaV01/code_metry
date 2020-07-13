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
import java.util.*;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
		assertEquals(new IsHappyNumber().isHappyNumber(-7), false);
      assertEquals(new IsHappyNumber().isHappyNumber(1), true);
      assertEquals(new IsHappyNumber().isHappyNumber(2), false);
      assertEquals(new IsHappyNumber().isHappyNumber(98), false);
   }

   @Test
   public void testCase2() {
      assertEquals(new IsHappyNumber().isHappyNumber(405), false);
      assertEquals(new IsHappyNumber().isHappyNumber(97), true);
      assertEquals(new IsHappyNumber().isHappyNumber(404), true);
      assertEquals(new IsHappyNumber().isHappyNumber(0), false);
   }
}