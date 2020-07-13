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
import static org.junit.Assert.assertArrayEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
      assertArrayEquals(new ShortenLongRuns().shortenLongRuns(new int[]{2, 3, 5, 5, 5, 3}, 2), new int[]{2, 3, 5, 3});
      assertArrayEquals(new ShortenLongRuns().shortenLongRuns(new int[]{2, 3, 5, 5, 5, 3}, 3), new int[]{2, 3, 5, 5, 3});
   }

}