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
    TriangleAreaByCoordinates triangleAreaByCoordinates = new TriangleAreaByCoordinates();
   @Test
   public void testCase1() {
      assertEquals(222, triangleAreaByCoordinates.triangleAreaByCoordinates(23, 30, 15, 15, 50, 25));
      assertEquals(127, triangleAreaByCoordinates.triangleAreaByCoordinates(23, 30, 15, 15, 32, 15));
      assertEquals(170, triangleAreaByCoordinates.triangleAreaByCoordinates(15, 35, 15, 15, 32, 15));
   }

   @Test
   public void testCase2() {
      assertEquals(190, triangleAreaByCoordinates.triangleAreaByCoordinates(25, 35, 15, 15, 34, 15));
      assertEquals(19, triangleAreaByCoordinates.triangleAreaByCoordinates(25, 17, 15, 15, 34, 15));
   }
}