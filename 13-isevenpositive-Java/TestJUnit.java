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
    IsEvenPositiveInt isEvenPositiveInt = new IsEvenPositiveInt();
   @Test
   public void testCase1() {
      assertEquals(false, isEvenPositiveInt.isEvenPositiveInt(1));
      assertEquals(false, isEvenPositiveInt.isEvenPositiveInt(-1));
      assertEquals(false, isEvenPositiveInt.isEvenPositiveInt(-2));
      assertEquals(false, isEvenPositiveInt.isEvenPositiveInt(-3));
      assertEquals(true, isEvenPositiveInt.isEvenPositiveInt(2));
   }

   @Test
   public void testCase2() {
    assertEquals(false, isEvenPositiveInt.isEvenPositiveInt(3));
    assertEquals(true, isEvenPositiveInt.isEvenPositiveInt(123456));
   }
}