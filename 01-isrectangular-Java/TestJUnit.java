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
      isrectangular s = new isrectangular();
      int[][] arr = {{1,2,3}, {1,1}};
      int[][] arr1 = {{1,2,3},{1,1,2}};
      assertEquals("1.",  false, s.fun_isrectangular(arr));
      assertEquals("2.",  true, s.fun_isrectangular(arr1));
   }


   @Test
   public void testCase2() {
      isrectangular s = new isrectangular();
      int[][] arr = {{},{}};
      int[][] arr1 = {{1,2},{1,1},{1,2,3}};
      assertEquals("1.", true, s.fun_isrectangular(arr));
      assertEquals("2.",  false, s.fun_isrectangular(arr1));
   }
}

