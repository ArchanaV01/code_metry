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
		assertEquals(new LongestCommonSubString().longestCommonSubstring("abcdef", "abqrcdest"), "cde");
		assertEquals(new LongestCommonSubString().longestCommonSubstring("abcdef", "ghi"), "");
		assertEquals(new LongestCommonSubString().longestCommonSubstring("abABC", "abcAB"), "AB");
		assertEquals(new LongestCommonSubString().longestCommonSubstring("abcdef", "abqrcdest"),  "cde");
		assertEquals(new LongestCommonSubString().longestCommonSubstring("abcdef", "ghi"),  "");
		assertEquals(new LongestCommonSubString().longestCommonSubstring("", "abqrcdest"),  "");
		assertEquals(new LongestCommonSubString().longestCommonSubstring("abcdef", ""),  "");
		assertEquals(new LongestCommonSubString().longestCommonSubstring("abcABC", "zzabZZAB"),  "AB");
   }

}

