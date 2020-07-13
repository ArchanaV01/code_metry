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
import static org.junit.Assert.assertArrayEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
		assertArrayEquals(new BonusPlayThreeDiceYahtzee().bonusPlayThreeDiceYahtzee(2312413), new int[]{432, 4});
      assertArrayEquals(new BonusPlayThreeDiceYahtzee().bonusPlayThreeDiceYahtzee(2315413), new int[]{532, 5});
      assertArrayEquals(new BonusPlayThreeDiceYahtzee().bonusPlayThreeDiceYahtzee(2345413), new int[]{443, 18});
   }

   @Test
   public void testCase2() {
      assertArrayEquals(new BonusPlayThreeDiceYahtzee().bonusPlayThreeDiceYahtzee(2633413), new int[]{633, 16});
      assertArrayEquals(new BonusPlayThreeDiceYahtzee().bonusPlayThreeDiceYahtzee(2333413), new int[]{333, 29});
      assertArrayEquals(new BonusPlayThreeDiceYahtzee().bonusPlayThreeDiceYahtzee(2333555), new int[]{555, 35});
   }
}