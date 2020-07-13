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
      nth_carolprime s = new nth_carolprime();
      
      assertEquals("1.", 7, s.fun_nth_carolprime(0));
      assertEquals("2.", 47, s.fun_nth_carolprime(1));
      assertEquals("3.", 223, s.fun_nth_carolprime(2));
   }


   @Test
   public void testCase2() {
      nth_carolprime s = new nth_carolprime();
      
      assertEquals("1.", 959, s.fun_nth_carolprime(3));
      assertEquals("2.", 3967, s.fun_nth_carolprime(4)); 
      assertEquals("3.", 16127, s.fun_nth_carolprime(5)); 
      assertEquals("3.", 65023, s.fun_nth_carolprime(6)); 
   }
}

