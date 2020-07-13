/**
 * This is JUnit that tests the methods of the Clock.
 * This contains 2 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and 
 * paste the last three lines of the code (TestCase2).
 * 
 * @author: Deepak
 */

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

import java.beans.Transient;

public class TestJUnit {

   @Test
   public void testCase1() {
      find_int_roots s = new find_int_roots();
      int[] a1 = {2,3};
      int[] a2 = {2,4};
      int[] a3 = {-4,3};

      assertArrayEquals("1.", a1, s.fun_find_int_roots(1,-5, 6));
      assertArrayEquals("2.", a2, s.fun_find_int_roots(1, -6, 8));
      assertArrayEquals("3.", a3, s.fun_find_int_roots(1, 1, -12));
   }

   @Test
   public void testCase2() {
      find_int_roots s = new find_int_roots();
      int[] a1 = {1, 5};
      int[] a2 = {-2, -1};

      assertArrayEquals("1.", a1, s.fun_find_int_roots(1,-6, 5));
      assertArrayEquals("2.", a2, s.fun_find_int_roots(1, 3, 2)); 
   }
}

