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
      nth_additive_prime s = new nth_additive_prime();
      
      assertEquals("1.", 2, s.fun_nth_additive_prime(0));
      assertEquals("2.", 3, s.fun_nth_additive_prime(1));
      assertEquals("3.", 23, s.fun_nth_additive_prime(5));
   }

   @Test
   public void testCase2() {
      nth_additive_prime s = new nth_additive_prime();
      
      assertEquals("1.", 41, s.fun_nth_additive_prime(7));
      assertEquals("2.", 157, s.fun_nth_additive_prime(20)); 
      assertEquals("2.", 197, s.fun_nth_additive_prime(25)); 
   }
}

