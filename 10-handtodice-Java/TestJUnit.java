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
import static org.junit.Assert.assertArrayEquals;

public class TestJUnit {
   HandToDice handToDice = new HandToDice();
   @Test
   public void testCase1() {
      assertArrayEquals(new int[]{1, 2, 3}, handToDice.handToDice(123));
   }

   @Test
   public void testCase2() {
      assertArrayEquals(new int[]{2, 1, 4}, handToDice.handToDice(214));
   }

   @Test
   public void testCase3() {
      assertArrayEquals(new int[]{4, 2, 2}, handToDice.handToDice(422));
   }

   @Test
   public void testCase4() {
      assertArrayEquals(new int[]{4, 0, 0}, handToDice.handToDice(400));
   }

   @Test
   public void testCase5() {
      assertArrayEquals(new int[]{1, 0, 1}, handToDice.handToDice(101));
   }
}