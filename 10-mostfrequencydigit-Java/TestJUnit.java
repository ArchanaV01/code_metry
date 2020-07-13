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
import java.util.*;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
		assertEquals(new MostFrequentDigit().mostFrequentDigit(-24), 2);
      assertEquals(new MostFrequentDigit().mostFrequentDigit(0), 1);
      assertEquals(new MostFrequentDigit().mostFrequentDigit(26011), 1);
      assertEquals(new MostFrequentDigit().mostFrequentDigit(1102300), 0);
   }

   @Test
   public void testCase2() {
      assertEquals(new MostFrequentDigit().mostFrequentDigit(14), 1);
      assertEquals(new MostFrequentDigit().mostFrequentDigit(2), 2);
      assertEquals(new MostFrequentDigit().mostFrequentDigit(5), 5);
      assertEquals(new MostFrequentDigit().mostFrequentDigit(52311231), 1);
      assertEquals(new MostFrequentDigit().mostFrequentDigit(52355235), 5);
   }
}