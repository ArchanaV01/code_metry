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
      nth_tidynumber s = new nth_tidynumber();
      
      assertEquals("1.", 1, s.fun_nth_tidynumber(0));
      assertEquals("2.", 2, s.fun_nth_tidynumber(1));
      assertEquals("3.", 6, s.fun_nth_tidynumber(5));
      assertEquals("3.", 17, s.fun_nth_tidynumber(15));
   }


   @Test
   public void testCase2() {
      nth_tidynumber s = new nth_tidynumber();
      
      assertEquals("1.", 46, s.fun_nth_tidynumber(35));
      assertEquals("2.", 79, s.fun_nth_tidynumber(50)); 
      assertEquals("3.", 223, s.fun_nth_tidynumber(100)); 
      assertEquals("3.", 1156, s.fun_nth_tidynumber(250)); 
      assertEquals("3.", 2888, s.fun_nth_tidynumber(500)); 
   }
}

