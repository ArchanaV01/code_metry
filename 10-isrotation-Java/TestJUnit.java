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
      assertEquals(new IsRotation().isRotation(3412, 1234), true);
      assertEquals(new IsRotation().isRotation(1234, 1234), true);
      assertEquals(new IsRotation().isRotation(3142, 1234), false);
      assertEquals(new IsRotation().isRotation(12345, 54321), true);
   }

   @Test
   public void testCase2() {
      assertEquals(new IsRotation().isRotation(12345, 4321), false);
      assertEquals(new IsRotation().isRotation(10010, 10100), false);
      assertEquals(new IsRotation().isRotation(101111, 11110), false);
      assertEquals(new IsRotation().isRotation(12345678, 43125678), false);
   }
}