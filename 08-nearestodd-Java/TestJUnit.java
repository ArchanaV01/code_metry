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
      nearestodd s = new nearestodd();
      assertEquals("1.", 11, s.fun_nearestodd(12.0));
      assertEquals("2.", 15, s.fun_nearestodd(14.2));
      assertEquals("3.", 17, s.fun_nearestodd(16.5));
      assertEquals("4.", 19, s.fun_nearestodd(18.6));
    }

   @Test
   public void testCase2() {
      nearestodd s = new nearestodd();
      assertEquals("1.", 25, s.fun_nearestodd(25.0));
      assertEquals("2.", 27, s.fun_nearestodd(27.2));
      assertEquals("3.", 29, s.fun_nearestodd(29.5));
      assertEquals("4.", 31, s.fun_nearestodd(31.6));
   }
}

