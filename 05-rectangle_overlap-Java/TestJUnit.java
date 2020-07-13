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
      rectangle_overlap s = new rectangle_overlap();
      assertEquals("1.", true, s.fun_rectangle_overlap(0,2,1,4,1,6,8,4));
      assertEquals("2.", false, s.fun_rectangle_overlap(0,3,1,4,20,22,6,3));
   }

   @Test
   public void testCase2() {
      rectangle_overlap s = new rectangle_overlap();
      assertEquals("1.", false, s.fun_rectangle_overlap(5,12,11,14,31,36,8,4));
      assertEquals("2.", true, s.fun_rectangle_overlap(0,0,1,4,1,4,1,2));
   }
}

