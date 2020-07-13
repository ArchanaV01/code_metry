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
		assertEquals(new SameChars().sameChars("abcabcabc", "cba") , true);
		assertEquals(new SameChars().sameChars("abcabcabc", "cbad") , false);
		assertEquals(new SameChars().sameChars("abcabcabc", "cBa") , false);
		assertEquals(new SameChars().sameChars("42","The other parameter is not a string") , false);
		assertEquals(new SameChars().sameChars("","") , true);
   }

}
