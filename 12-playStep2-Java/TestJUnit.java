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
    PlayStep2 playStep2 = new PlayStep2();
   @Test
   public void testCase1() {
      assertArrayEquals(new int[]{421, 23}, playStep2.playStep2(413, 2312));
   }

   @Test
   public void testCase2() {
      assertArrayEquals(new int[]{544, 23}, playStep2.playStep2(413, 2345));
   }

   @Test
   public void testCase3() {
      assertArrayEquals(new int[]{443, 2}, playStep2.playStep2(544, 23));
   }

   @Test
   public void testCase4() {
      assertArrayEquals(new int[]{644, 45}, playStep2.playStep2(544, 456));
   }
}