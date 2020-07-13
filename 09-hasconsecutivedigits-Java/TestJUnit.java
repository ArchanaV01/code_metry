/**
 * This is JUnit that tests the sleepIn method that is available in SleepIn class.
 * This contains 4 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and paste the last three 
 * lines of the code (TestCase4).
 * 
 * @author: Siva Sankar
 */

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
		assertEquals(new HasConsecutiveDigits().hasConsecutiveDigits(-24), false);
      assertEquals(new HasConsecutiveDigits().hasConsecutiveDigits(0), false);
      assertEquals(new HasConsecutiveDigits().hasConsecutiveDigits(26011), true);
      assertEquals(new HasConsecutiveDigits().hasConsecutiveDigits(14), false);
   }

   @Test
   public void testCase2() {
      assertEquals(new HasConsecutiveDigits().hasConsecutiveDigits(-11023), true);
      assertEquals(new HasConsecutiveDigits().hasConsecutiveDigits(2), false);
      assertEquals(new HasConsecutiveDigits().hasConsecutiveDigits(5), false);
      assertEquals(new HasConsecutiveDigits().hasConsecutiveDigits(52311231), true);
      assertEquals(new HasConsecutiveDigits().hasConsecutiveDigits(-52311231), true);
   }
}