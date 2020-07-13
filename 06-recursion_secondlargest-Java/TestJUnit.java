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
      assertEquals(new SecondLargest().secondLargest(new int[]{1, 2, 3, 4, 5}), new Integer(4));
      assertEquals(new SecondLargest().secondLargest(new int[]{4, 3}), new Integer(3));
      assertEquals(new SecondLargest().secondLargest(new int[]{4, 4, 3}), new Integer(4));
   }

   @Test
   public void testCase2() {
      assertEquals(new SecondLargest().secondLargest(new int[]{-3, -4}), new Integer(-4));
      assertEquals(new SecondLargest().secondLargest(new int[]{4}), null);
      assertEquals(new SecondLargest().secondLargest(new int[0]), null);
   }

}