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
		assertEquals(new IsPerfectSquare().isPerfectSquare(-625), false);
      assertEquals(new IsPerfectSquare().isPerfectSquare(625), true);
      assertEquals(new IsPerfectSquare().isPerfectSquare(4), true);
      assertEquals(new IsPerfectSquare().isPerfectSquare(100), true);
      assertEquals(new IsPerfectSquare().isPerfectSquare(1100), false);
      assertEquals(new IsPerfectSquare().isPerfectSquare(-100), false);
      assertEquals(new IsPerfectSquare().isPerfectSquare(0), true);
   }
}
