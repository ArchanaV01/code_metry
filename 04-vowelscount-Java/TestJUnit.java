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
      vowelscount s = new vowelscount();
      
      assertEquals("1.", 3, s.fun_vowelscount("Abc def!!! a? yzyzyz!"));
      assertEquals("2.",  3, s.fun_vowelscount("zodiac"));
      assertEquals("3.", 1, s.fun_vowelscount("ABCDXYZ"));
   }

   @Test
   public void testCase2() {
      vowelscount s = new vowelscount();
      
      assertEquals("1.", 4, s.fun_vowelscount("Hell123ooo"));
      assertEquals("2.", 10, s.fun_vowelscount("aeiouAeiou  ")); 
   }
}

