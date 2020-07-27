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
      nthtenlyprime s = new nthtenlyprime();
      
      assertEquals("1.", 19, s.fun_nthtenlyprime(0));
      assertEquals("2.", 37, s.fun_nthtenlyprime(1));
      assertEquals("3.", 127, s.fun_nthtenlyprime(4));
      assertEquals("3.", 523, s.fun_nthtenlyprime(10));
   }

   @Test
   public void testCase2() {
      nthtenlyprime s = new nthtenlyprime();
      
      assertEquals("1.", 1009, s.fun_nthtenlyprime(15));
      assertEquals("2.", 1423, s.fun_nthtenlyprime(20)); 
      assertEquals("2.", 2053, s.fun_nthtenlyprime(25)); 
   }
}

