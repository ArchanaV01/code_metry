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
      hasnoprimes s = new hasnoprimes();
      int[][] arr = {{12,4,6}, {8,12,14},{6,18}};
      int[][] arr1 = {{2}};
      assertEquals("1.",  true, s.fun_hasnoprimes(arr));
      assertEquals("2.",  false, s.fun_hasnoprimes(arr1));
   }


   @Test
   public void testCase2() {
      hasnoprimes s = new hasnoprimes();
      int[][] arr = {{9,12},{8},{16,8}};
      int[][] arr1 = {{9,12},{8},{16,8,19}};
      assertEquals("1.", true, s.fun_hasnoprimes(arr));
      assertEquals("2.",  false, s.fun_hasnoprimes(arr1));
   }
}

