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
      nth_happy_prime s = new nth_happy_prime();
      
      assertEquals("1.", 7, s.fun_nth_happy_prime(0));
      assertEquals("2.", 13, s.fun_nth_happy_prime(1));
      assertEquals("3.", 19, s.fun_nth_happy_prime(2));
   }

   @Test
   public void testCase2() {
      nth_happy_prime s = new nth_happy_prime();
      
      assertEquals("1.", 23, s.fun_nth_happy_prime(3));
      assertEquals("2.", 31, s.fun_nth_happy_prime(4)); 
   }
}

