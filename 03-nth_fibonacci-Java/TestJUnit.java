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
import static org.junit.Assert.assertEquals;

import java.beans.Transient;

public class TestJUnit {

   @Test
   public void testCase1() {
      nth_fibonacci s = new nth_fibonacci();
      assertEquals("1.", 1, s.fun_nthfibonaccinumber(0));
      assertEquals("2.", 1, s.fun_nthfibonaccinumber(1));
      assertEquals("3.", 2, s.fun_nthfibonaccinumber(2));
      assertEquals("4.", 3, s.fun_nthfibonaccinumber(3));
      assertEquals("5.", 5, s.fun_nthfibonaccinumber(4));
      assertEquals("6.", 8, s.fun_nthfibonaccinumber(5));
   }

   @Test
   public void testCase2() {
      nth_fibonacci s = new nth_fibonacci();
      assertEquals("1.", 13, s.fun_nthfibonaccinumber(6));
      assertEquals("2.", 21, s.fun_nthfibonaccinumber(7));
      assertEquals("3.", 34, s.fun_nthfibonaccinumber(8));
      assertEquals("4.", 55, s.fun_nthfibonaccinumber(9));
      assertEquals("5.", 89, s.fun_nthfibonaccinumber(10));
      assertEquals("6.", 144, s.fun_nthfibonaccinumber(11));
   }
}

