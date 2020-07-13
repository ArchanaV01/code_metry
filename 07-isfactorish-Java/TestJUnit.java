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
      isfactorish s = new isfactorish();
      assertEquals("1.", true, s.fun_isfactorish(412));
      assertEquals("2.",  true, s.fun_isfactorish(-412));
      assertEquals("3.", false, s.fun_isfactorish(4128));
      assertEquals("3.", false, s.fun_isfactorish(112));
   }

   @Test
   public void testCase2() {
      isfactorish s = new isfactorish();
      assertEquals("1.", false, s.fun_isfactorish(420));
      assertEquals("2.",  false, s.fun_isfactorish(42));
      assertEquals("3.", true, s.fun_isfactorish(315)); 
   }
}

