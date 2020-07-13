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
      fabricyards s = new fabricyards();
      assertEquals("1.", 0, s.fun_fabricyards(0));
      assertEquals("2.", 1, s.fun_fabricyards(1));
      assertEquals("3.", 1, s.fun_fabricyards(35));
      assertEquals("4.", 1, s.fun_fabricyards(36));
      assertEquals("5.", 2, s.fun_fabricyards(37));
      assertEquals("6.", 2, s.fun_fabricyards(38));
      assertEquals("7.", 2, s.fun_fabricyards(72));
      assertEquals("8.", 3, s.fun_fabricyards(73));
   }

   @Test
   public void testCase2() {
      fabricyards s = new fabricyards();
      assertEquals("1.", 0, s.fun_fabricexcess(0));
      assertEquals("2.", 35, s.fun_fabricexcess(1));
      assertEquals("3.", 1, s.fun_fabricexcess(35));
      assertEquals("4.", 0, s.fun_fabricexcess(36));
      assertEquals("5.", 35, s.fun_fabricexcess(37));
      assertEquals("6.", 34, s.fun_fabricexcess(38));
      assertEquals("7.", 0, s.fun_fabricexcess(72));
      assertEquals("8.", 35, s.fun_fabricexcess(73));
   }
}

