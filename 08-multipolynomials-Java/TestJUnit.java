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
      assertArrayEquals(new MultiPolynomials().multiPolynomials(new int[]{1, 1}, new int[]{1, -1}), new int[]{1, 0, -1});
      assertArrayEquals(new MultiPolynomials().multiPolynomials(new int[]{1, -1}, new int[]{1, -1}), new int[]{1, -2, 1});
      assertArrayEquals(new MultiPolynomials().multiPolynomials(new int[]{1, 1}, new int[]{1, 1}), new int[]{1, 2, 1});
      assertArrayEquals(new MultiPolynomials().multiPolynomials(new int[]{1}, new int[]{1}), new int[]{1});
      assertArrayEquals(new MultiPolynomials().multiPolynomials(new int[]{1, 0}, new int[]{1, 1}), new int[]{1, 1, 0});
      assertArrayEquals(new MultiPolynomials().multiPolynomials(new int[]{1, 1, 1}, new int[]{1, 0}), new int[]{1, 1, 1, 0});
   }

}
