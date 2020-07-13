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
      nth_uglynumber s = new nth_uglynumber();
      
      assertEquals("1.", 1, s.fun_nth_uglynumber(0));
      assertEquals("2.", 2, s.fun_nth_uglynumber(1));
      assertEquals("3.", 3, s.fun_nth_uglynumber(2));
      assertEquals("3.", 6, s.fun_nth_uglynumber(5));
   }

   
   @Test
   public void testCase2() {
      nth_uglynumber s = new nth_uglynumber();
      
      assertEquals("1.", 15, s.fun_nth_uglynumber(10));
      assertEquals("2.", 60, s.fun_nth_uglynumber(25)); 
      assertEquals("2.", 250, s.fun_nth_uglynumber(50)); 
      assertEquals("3.", 1600, s.fun_nth_uglynumber(100)); 
   }
}

