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
		assertEquals(new LargestPerfectSquare().largestPerfectSquare(24), 16);
      assertEquals(new LargestPerfectSquare().largestPerfectSquare(25), 25);
      assertEquals(new LargestPerfectSquare().largestPerfectSquare(26), 25);
   }

   @Test
   public void testCase2() {
      assertEquals(new LargestPerfectSquare().largestPerfectSquare(14), 9);
      assertEquals(new LargestPerfectSquare().largestPerfectSquare(2), 1);
      assertEquals(new LargestPerfectSquare().largestPerfectSquare(5), 4);
   }
}