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
    LineIntersection lineIntersection = new LineIntersection();
   @Test
   public void testCase1() {
      assertEquals(0, lineIntersection.lineIntersection(4, 13, 8, 17));
      assertEquals(0, lineIntersection.lineIntersection(2, 13, 2, 14));
      assertEquals(0, lineIntersection.lineIntersection(8, 13, 4, 17));
   }

   @Test
   public void testCase2() {
      assertEquals(4, lineIntersection.lineIntersection(4, 13, 3, 17));
      assertEquals(2, lineIntersection.lineIntersection(4, 27, 9, 17));
   }
}