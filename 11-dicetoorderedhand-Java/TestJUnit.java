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
    DiceToOrderedHand diceToOrderedHand = new DiceToOrderedHand();
   @Test
   public void testCase1() {
      assertEquals(321, diceToOrderedHand.diceToOrderedHand(1, 2, 3));
   }

   @Test
   public void testCase2() {
      assertEquals(654, diceToOrderedHand.diceToOrderedHand(6, 5, 4));
   }

   @Test
   public void testCase3() {
    assertEquals(421, diceToOrderedHand.diceToOrderedHand(1, 4, 2));
   }

   @Test
   public void testCase4() {
    assertEquals(665, diceToOrderedHand.diceToOrderedHand(6, 5, 6));
   }

   @Test
   public void testCase5() {
    assertEquals(222, diceToOrderedHand.diceToOrderedHand(2, 2, 2));
   }
}
