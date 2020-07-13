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
      nth_happy_number s = new nth_happy_number();
      
      assertEquals("1.", 1, s.fun_nth_happy_number(0));
      assertEquals("2.", 7, s.fun_nth_happy_number(1));
      assertEquals("3.", 10, s.fun_nth_happy_number(2));
      assertEquals("3.", 13, s.fun_nth_happy_number(3));
   }

   @Test
   public void testCase2() {
      nth_happy_number s = new nth_happy_number();
      
      assertEquals("1.", 19, s.fun_nth_happy_number(4));
      assertEquals("2.", 23, s.fun_nth_happy_number(5)); 
      assertEquals("2.", 28, s.fun_nth_happy_number(6)); 
      assertEquals("2.", 31, s.fun_nth_happy_number(7)); 
   }
}

