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
    TriangleArea triangleArea = new TriangleArea();
   @Test
   public void testCase1() {
      assertEquals(24, triangleArea.triangleArea(4.0, 13.0, 15.0));
      assertEquals(216, triangleArea.triangleArea(24.0, 18.0, 30.0));
      assertEquals(6, triangleArea.triangleArea(4.0, 5.0, 3.0));
   }

   @Test
   public void testCase2() {
      assertEquals(43, triangleArea.triangleArea(10.0, 10.0, 10.0));
      assertEquals(45, triangleArea.triangleArea(10.0, 10.5, 10.0));
   }
}