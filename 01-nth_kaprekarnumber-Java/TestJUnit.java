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
      nth_kaprekarnumber s = new nth_kaprekarnumber();
      
      assertEquals("1.", 1, s.fun_nth_kaprekarnumber(0));
      assertEquals("2.", 9, s.fun_nth_kaprekarnumber(1));
      assertEquals("3.", 297, s.fun_nth_kaprekarnumber(5));
   }

   @Test
   public void testCase2() {
      nth_kaprekarnumber s = new nth_kaprekarnumber();
      
      assertEquals("1.", 4879, s.fun_nth_kaprekarnumber(10));
      assertEquals("2.", 7777, s.fun_nth_kaprekarnumber(15)); 
      assertEquals("3.", 77778, s.fun_nth_kaprekarnumber(20)); 
   }
}

