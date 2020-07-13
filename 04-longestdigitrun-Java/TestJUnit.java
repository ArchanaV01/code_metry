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
      assertEquals(new LongestDigitRun().longestDigitRun(117773732),7);
      assertEquals(new LongestDigitRun().longestDigitRun(11455567), 5);
      assertEquals(new LongestDigitRun().longestDigitRun(12345), 1);
   }

   @Test
   public void testCase2() {
      assertEquals(new LongestDigitRun().longestDigitRun(-677886), 7);
      assertEquals(new LongestDigitRun().longestDigitRun(44332211), 1);
      assertEquals(new LongestDigitRun().longestDigitRun(3330001), 0);
   }
}