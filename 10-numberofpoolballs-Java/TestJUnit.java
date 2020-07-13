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
		assertEquals(new NumberOfPoolBalls().numberOfPoolBalls(1), 1);
      assertEquals(new NumberOfPoolBalls().numberOfPoolBalls(2), 3);
      assertEquals(new NumberOfPoolBalls().numberOfPoolBalls(3), 6);
      assertEquals(new NumberOfPoolBalls().numberOfPoolBalls(4), 10);
      assertEquals(new NumberOfPoolBalls().numberOfPoolBalls(5), 15);
      assertEquals(new NumberOfPoolBalls().numberOfPoolBalls(6), 21);
      assertEquals(new NumberOfPoolBalls().numberOfPoolBalls(7), 28);
      assertEquals(new NumberOfPoolBalls().numberOfPoolBalls(8), 36);
      assertEquals(new NumberOfPoolBalls().numberOfPoolBalls(9), 45);
   }

   @Test
   public void testCase2() {
      assertEquals(new NumberOfPoolBalls().numberOfPoolBalls(10), 55);
      assertEquals(new NumberOfPoolBalls().numberOfPoolBalls(11), 66);
      assertEquals(new NumberOfPoolBalls().numberOfPoolBalls(12), 78);
      assertEquals(new NumberOfPoolBalls().numberOfPoolBalls(13), 91);
      assertEquals(new NumberOfPoolBalls().numberOfPoolBalls(14), 105);
      assertEquals(new NumberOfPoolBalls().numberOfPoolBalls(15), 120);
      assertEquals(new NumberOfPoolBalls().numberOfPoolBalls(100), 5050);
      assertEquals(new NumberOfPoolBalls().numberOfPoolBalls(1000), 500500);
   }
}