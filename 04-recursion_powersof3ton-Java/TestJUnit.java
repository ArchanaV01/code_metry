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
import static org.junit.Assert.assertArrayEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
      assertArrayEquals(new PowersOf3ToN().powersOf3ToN(0), new int[0]);
      assertArrayEquals(new PowersOf3ToN().powersOf3ToN(-42), new int[0]);
      assertArrayEquals(new PowersOf3ToN().powersOf3ToN(0.99), new int[0]);
      assertArrayEquals(new PowersOf3ToN().powersOf3ToN(1), new int[]{1});
      assertArrayEquals(new PowersOf3ToN().powersOf3ToN(3), new int[]{1, 3});
   }

   @Test
   public void testCase2() {
      assertArrayEquals(new PowersOf3ToN().powersOf3ToN(8.9999), new int[]{1, 3});
      assertArrayEquals(new PowersOf3ToN().powersOf3ToN(9), new int[]{1, 3, 9});
      assertArrayEquals(new PowersOf3ToN().powersOf3ToN(9.1111), new int[]{1, 3, 9});
      assertArrayEquals(new PowersOf3ToN().powersOf3ToN(100), new int[]{1, 3, 9, 27, 81});
   }

}