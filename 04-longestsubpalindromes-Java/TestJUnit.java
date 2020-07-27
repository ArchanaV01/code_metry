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
      longestsubpalindromes s = new longestsubpalindromes();
      
      assertEquals("1.", "abcba", s.fun_longestsubpalindromes("abcba"));
      assertEquals("2.", "b-4-b", s.fun_longestsubpalindromes("ab-4-be!!!"));
   }

   @Test
   public void testCase2() {
      longestsubpalindromes s = new longestsubpalindromes();
      
      assertEquals("1.", "abba", s.fun_longestsubpalindromes("abba"));
      assertEquals("2.", "cbc", s.fun_longestsubpalindromes("abcbce"));
   }
}

