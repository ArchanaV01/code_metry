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
      kth_occurrences s = new kth_occurrences();
      assertEquals("1.",  'o', s.fun_kth_occurrences("helllo woorld", 2));
      assertEquals("2.",  'v', s.fun_kth_occurrences("hsdibdouvbeiovbfeibvdsioubidsbvviefadbcildfab", 4));
      assertEquals("3.", 'h', s.fun_kth_occurrences("    h  ", 2));
   }


   @Test
   public void testCase2() {
      kth_occurrences s = new kth_occurrences();
      assertEquals("1.", 'a', s.fun_kth_occurrences("hello hyderabad a", 1));
      assertEquals("2.",  'n', s.fun_kth_occurrences("england", 1));
      assertEquals("3.", 'h', s.fun_kth_occurrences("asuszenphonemaxm1 aemnsh", 6)); 
   }
}

