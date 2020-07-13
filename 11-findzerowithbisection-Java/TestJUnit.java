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
import static org.junit.Assert.assertEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
      assertEquals(new Bisection().bisection(25, 0.01, 0.1), 5.00030517578125, 0.00000000000001);
      assertEquals(new Bisection().bisection(49, 0.01, 0.1), 6.999786376953125, 0.00000000000001);
      assertEquals(new Bisection().bisection(81, 0.01, 0.1), 9.000274658203125, 0.00000000000001);
   }

}