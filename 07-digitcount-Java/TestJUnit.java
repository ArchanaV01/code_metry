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
		assertEquals(new DigitCount().digitCount(-24), -2);
      assertEquals(new DigitCount().digitCount(0), 1);
      assertEquals(new DigitCount().digitCount(26), 2);
      assertEquals(new DigitCount().digitCount(-52311231), 8);
   }

   @Test
   public void testCase2() {
      assertEquals(new DigitCount().digitCount(14), 2);
      assertEquals(new DigitCount().digitCount(2), 1);
      assertEquals(new DigitCount().digitCount(5), 1);
      assertEquals(new DigitCount().digitCount(52311231), 8);
   }
}