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
      nth_lefttruncatableprime s = new nth_lefttruncatableprime();
      
      assertEquals("1.", 2, s.fun_nth_lefttruncatableprime(0));
      assertEquals("2.", 3, s.fun_nth_lefttruncatableprime(1));
      assertEquals("3.", 17, s.fun_nth_lefttruncatableprime(5));
   }

   @Test
   public void testCase2() {
      nth_lefttruncatableprime s = new nth_lefttruncatableprime();
      
      assertEquals("1.", 53, s.fun_nth_lefttruncatableprime(10));
      assertEquals("2.", 113, s.fun_nth_lefttruncatableprime(15)); 
      assertEquals("3.", 223, s.fun_nth_lefttruncatableprime(20)); 
      assertEquals("3.", 347, s.fun_nth_lefttruncatableprime(25)); 
   }
}

