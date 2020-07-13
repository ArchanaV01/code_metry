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
		assertEquals(new GCD().gcd(2, 3), 1);
      assertEquals(new GCD().gcd(1000, 12345), 5);
      assertEquals(new GCD().gcd(1000000, 999995), 5);
      assertEquals(new GCD().gcd(1000000,999994), 2);
      assertEquals(new GCD().gcd(88886, 474747), 7);
      assertEquals(new GCD().gcd(151, 139), 1);
   }

   @Test
   public void testCase2() {
      assertEquals(new GCD().gcd(14456, 143), 13);
      assertEquals(new GCD().gcd(155667, 54321), 57);
      assertEquals(new GCD().gcd(24323, 53245), 1);
      assertEquals(new GCD().gcd(0, 1), 1);
      assertEquals(new GCD().gcd(1, 0), 1);
   }
}