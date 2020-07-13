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
      replace s = new replace();
      
      assertEquals("1.", "345world123", s.fun_replace("helloworld123", "hello", "345"));
      assertEquals("2.",  "helloworld345", s.fun_replace("helloworld123", "123", "345"));
      assertEquals("3.", "hello345123", s.fun_replace("helloworld123", "world", "345"));
   }

   @Test
   public void testCase2() {
      replace s = new replace();
      
      assertEquals("1.", "helloworld123", s.fun_replace("helloworld123", "34567", "345"));
      assertEquals("2.", "hell     owo23ufn348hf oincodn     123", s.fun_replace("hellrldowo23ufn348hf oincodnrld123", "rld", "     ")); 
   }
}

