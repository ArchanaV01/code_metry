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
      assertArrayEquals(new InverseLookAndSay().inverseLookAndSay("[]"), new int[0]);
      assertArrayEquals(new InverseLookAndSay().inverseLookAndSay("[(3, 1)]"), new int[]{1, 1, 1});
      assertArrayEquals(new InverseLookAndSay().inverseLookAndSay("[(1, -1), (1, 2), (1, 7)]"), new int[]{-1, 2, 7});
   }

   @Test
   public void testCase2() {
      assertArrayEquals(new InverseLookAndSay().inverseLookAndSay("[(2, 3), (1, 8), (3, -10)]"), new int[]{3, 3, 8, -10, -10, -10});
      assertArrayEquals(new InverseLookAndSay().inverseLookAndSay("[(2, 3), (1, 8), (4, 3)]"), new int[]{3, 3, 8, 3, 3, 3, 3});
   }
}