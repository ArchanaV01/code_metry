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
      hasbalancedparantheses s = new hasbalancedparantheses();
      
      assertEquals("1.", false, s.fun_hasbalancedparantheses("( ( ( ( )3))  "));
      assertEquals("2.", true, s.fun_hasbalancedparantheses("( ( ( ( )3)))  "));
      assertEquals("3.", false, s.fun_hasbalancedparantheses("( ( ( ( ( )3)))  "));
   }

   @Test
   public void testCase2() {
      hasbalancedparantheses s = new hasbalancedparantheses();
      
      assertEquals("1.", false, s.fun_hasbalancedparantheses(") ) "));
      assertEquals("2.", true, s.fun_hasbalancedparantheses(" (  )  ")); 
      assertEquals("2.", true, s.fun_hasbalancedparantheses("  ")); 
   }
}

