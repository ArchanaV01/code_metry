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
      wordwrap s = new wordwrap();
      assertEquals("1.",  "a-b-\nc-de\n-fgh", s.fun_wordwrap(" a b c de fgh ",  4));
     
   }

   
   @Test
   public void testCase2() {
      wordwrap s = new wordwrap();
      assertEquals("1.", "abcd\nefgh\nij", s.fun_wordwrap("  abcdefghij", 4));
   }
}

