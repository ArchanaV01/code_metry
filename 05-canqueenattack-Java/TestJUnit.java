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
      assertEquals(new CanQueenAttack().canQueenAttack(4, 5, 6, 7), true);
      assertEquals(new CanQueenAttack().canQueenAttack(1, 1, 3, 2), false);
      assertEquals(new CanQueenAttack().canQueenAttack(1, 1, 4, 6), false);
      assertEquals(new CanQueenAttack().canQueenAttack(1, 1, 4, 6), false);
      assertEquals(new CanQueenAttack().canQueenAttack(2, 3, 4, 5), true);
   }

  @Test
   public void testCase2() {
      assertEquals(new CanQueenAttack().canQueenAttack(1, 1, 1, 2), true);
      assertEquals(new CanQueenAttack().canQueenAttack(1, 1, 5, 7), false);
      assertEquals(new CanQueenAttack().canQueenAttack(2, 2, 5, 4), false);
      assertEquals(new CanQueenAttack().canQueenAttack(1, 2, 3, 4), true);
      assertEquals(new CanQueenAttack().canQueenAttack(3, 4, 5, 6), true);
   }

}
