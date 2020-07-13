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
      rotatestrings s = new rotatestrings();
      assertEquals("1.",  "dabc", s.fun_rotatestrings("abcd", -1));
      assertEquals("2.",  "bcda", s.fun_rotatestrings("abcd", 1));
      assertEquals("3.", "cdab", s.fun_rotatestrings("abcd", -6));
   }


   @Test
   public void testCase2() {
      rotatestrings s = new rotatestrings();
      assertEquals("1.", "dabc", s.fun_rotatestrings("abcd", 3));
      assertEquals("2.",  "23ac3", s.fun_rotatestrings("ac323", 8));
      assertEquals("3.", "ac232", s.fun_rotatestrings("ac232", 0)); 
   }
}

