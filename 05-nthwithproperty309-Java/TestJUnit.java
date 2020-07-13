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
        assertEquals(new NthWithProperty309().nthWithProperty309(0), 309);
        assertEquals(new NthWithProperty309().nthWithProperty309(418), 1);
        assertEquals(new NthWithProperty309().nthWithProperty309(462), 2);
        assertEquals(new NthWithProperty309().nthWithProperty309(474), 3);
   }
   @Test
   public void testCase2() {
        assertEquals(new NthWithProperty309().nthWithProperty309(575), 4);
        assertEquals(new NthWithProperty309().nthWithProperty309(635), 5);
        assertEquals(new NthWithProperty309().nthWithProperty309(662), 6);
        assertEquals(new NthWithProperty309().nthWithProperty309(2014), 100);
   }
   @Test
   public void testCase3() {
        assertEquals(new NthWithProperty309().nthWithProperty309(7813), 1000);
   }
}
