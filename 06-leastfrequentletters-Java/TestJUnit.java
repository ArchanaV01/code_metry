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
		assertEquals(new LeastFrequentLetters().leastFrequentLetters("aDq efQ? FB'daf!!!"), "be");
		assertEquals(new LeastFrequentLetters().leastFrequentLetters("?'!!"), "");
		assertEquals(new LeastFrequentLetters().leastFrequentLetters("abc def! GFE'cag!!!"), "bd");
		assertEquals(new LeastFrequentLetters().leastFrequentLetters("abc def! GFE'cag!!!".toLowerCase()), "bd");
		assertEquals(new LeastFrequentLetters().leastFrequentLetters("abc def! GFE'cag!!!".toUpperCase()), "bd");
		assertEquals(new LeastFrequentLetters().leastFrequentLetters(""), "");
   }

}

