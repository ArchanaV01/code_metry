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
		assertEquals(new Median().median(new double[]{1, 2, 3, 4, 5}), 3);
      assertEquals(new Median().median(new double[]{1.1, 2.1, 3.1, 4.1, 5.1}), 3);
   }

   @Test
   public void testCase2() {
      assertEquals(new Median().median(new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}), 5);
      assertEquals(new Median().median(new double[]{1, 2, 3, 4, 5.5, 5.1, 7, 8, 9, 10}), 5);
      assertEquals(new Median().median(new double[]{1}), 1);
      assertEquals(new Median().median(new double[0]), 0);
   }
}