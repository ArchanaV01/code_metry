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
      getinrange s = new getinrange();
      assertEquals("1.", 3, s.fun_getinrange(1, 3, 5));
      assertEquals("2.", 4, s.fun_getinrange(4, 3, 5));
    }

   @Test
   public void testCase2() {
      getinrange s = new getinrange();
      assertEquals("1.", 6, s.fun_getinrange(7, 3, 6));
      assertEquals("2.", 5, s.fun_getinrange(6, 5, 3));
      assertEquals("3.", 2, s.fun_getinrange(0, 5, 2));  
   }
}