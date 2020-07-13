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
      get_kth_digit s = new get_kth_digit();
      assertEquals("1.", 9, s.fun_get_kth_digit(789,0));
      assertEquals("2.", 8, s.fun_get_kth_digit(789,1));
      assertEquals("3.", 7, s.fun_get_kth_digit(789,2));
    }

   @Test
   public void testCase2() {
      get_kth_digit s = new get_kth_digit();
      assertEquals("1.", 0, s.fun_get_kth_digit(789,3));
      assertEquals("2.", 9, s.fun_get_kth_digit(-789, 0));
      assertEquals("3.", 0, s.fun_get_kth_digit(-789, 4));
   }
}

