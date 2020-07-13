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
      nearestkaprekarnumber s = new nearestkaprekarnumber();
      
      assertEquals("1.", 45, s.fun_nearestkaprekarnumber(49));
      assertEquals("2.", 55, s.fun_nearestkaprekarnumber(51));
      assertEquals("3.", 45, s.fun_nearestkaprekarnumber(50));
   }


   @Test
   public void testCase2() {
      nearestkaprekarnumber s = new nearestkaprekarnumber();
      
      assertEquals("1.", 99, s.fun_nearestkaprekarnumber(102));
      assertEquals("2.", 703, s.fun_nearestkaprekarnumber(765)); 
      assertEquals("3.", 4879, s.fun_nearestkaprekarnumber(3861)); 
   }
}

