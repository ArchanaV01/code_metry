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
      assertEquals(new IsSorted().isSorted(new double[]{1, 2, 3, 4, 5}), true);
      assertEquals(new IsSorted().isSorted(new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}), true);
      assertEquals(new IsSorted().isSorted(new double[]{1}), true);
      assertEquals(new IsSorted().isSorted(new double[]{1, 1}), true);
      assertEquals(new IsSorted().isSorted(new double[]{}), true);
      assertEquals(new IsSorted().isSorted(new double[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 10}), false);
   }

   @Test
   public void testCase2() {
      assertEquals(new IsSorted().isSorted(new double[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}), true);
      assertEquals(new IsSorted().isSorted(new double[]{1, 2, 3, 4, 5.5, 5.1, 7, 8, 9, 10}), false);
      assertEquals(new IsSorted().isSorted(new double[]{1, 2, 3, 4, 5.5, 5.5, 5.5, 5.5, -1, 10}), false);
      assertEquals(new IsSorted().isSorted(new double[]{10, -1, 5.5, 5.5, 5.5, 4, 3, 2, 1}), false);
      assertEquals(new IsSorted().isSorted(new double[]{-1, 0, -1.1}), false);
   }
}


