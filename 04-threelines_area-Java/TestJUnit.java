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
      threelines_area s = new threelines_area();
      assertEquals("1.", 6, s.fun_threelines_area(5,3,4));
      assertEquals("2.", 5, s.fun_threelines_area(4,4,3));
   }

   @Test
   public void testCase2() {
      threelines_area s = new threelines_area();
      assertEquals("1.", 39, s.fun_threelines_area(12,10,8));
      assertEquals("2.", 65, s.fun_threelines_area(16,12,11));
   }
}

