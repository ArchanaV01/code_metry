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
      set_kth_digit s = new set_kth_digit();
      assertEquals("1.", 461, s.fun_set_kth_digit(468, 0, 1));
      assertEquals("2.", 418, s.fun_set_kth_digit(468, 1, 1));
      assertEquals("3.", 168, s.fun_set_kth_digit(468, 2, 1));
    }

   @Test
   public void testCase2() {
      set_kth_digit s = new set_kth_digit();
      assertEquals("1.", 1468, s.fun_set_kth_digit(468, 3, 1));
      assertEquals("2.", -1468, s.fun_set_kth_digit(-468, 3, 1));
   }
}

