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
      nearestbusstop s = new nearestbusstop();
      assertEquals("1.", 8, s.fun_nearestbusstop(12));
      assertEquals("2.", 16, s.fun_nearestbusstop(13));
      assertEquals("3.", 8, s.fun_nearestbusstop(5));
    }

   @Test
   public void testCase2() {
      nearestbusstop s = new nearestbusstop();
      assertEquals("1.", 0, s.fun_nearestbusstop(4));
      assertEquals("2.", 8, s.fun_nearestbusstop(8));
      assertEquals("3.", 0, s.fun_nearestbusstop(0));
      assertEquals("4.", 16, s.fun_nearestbusstop(16));  
   }
}