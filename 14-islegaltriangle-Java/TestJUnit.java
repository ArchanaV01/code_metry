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
    IsLegalTriangle isLegalTriangle = new IsLegalTriangle();
   @Test
   public void testCase1() {
      assertEquals(false, isLegalTriangle.isLegalTriangle(1, 2, 3));
      assertEquals(true, isLegalTriangle.isLegalTriangle(7, 10, 5));
      assertEquals(false, isLegalTriangle.isLegalTriangle(1, 10, 12));
   }

   @Test
   public void testCase2() {
      assertEquals(false, isLegalTriangle.isLegalTriangle(1.1, 2.1, 3.2));
      assertEquals(true, isLegalTriangle.isLegalTriangle(7.9, 10.1, 5.9));
      assertEquals(false, isLegalTriangle.isLegalTriangle(1.00012, 10.0009090, 12.0000001));
   }
}