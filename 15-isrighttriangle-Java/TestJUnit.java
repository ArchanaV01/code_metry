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
    IsRightTriangle isRightTriangle = new IsRightTriangle();
   @Test
   public void testCase1() {
      assertEquals(true, isRightTriangle.isRightTriangle(13, -1, -9, 3, -3, -9));
      assertEquals(false, isRightTriangle.isRightTriangle(6, 1, 0, 4, -1, -7));
   }

   @Test
   public void testCase2() {
      assertEquals(false, isRightTriangle.isRightTriangle(1, 2, 5, 4, -3, 0));
      assertEquals(true, isRightTriangle.isRightTriangle(-1, 7, 10, -4, 12, -2));
      assertEquals(true, isRightTriangle.isRightTriangle(5, 4, 11, 6, 15, -6));
   }
}