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
		assertEquals(new NthAutomorphicNumbers().nthAutomorphicNumbers(1), 0);
		assertEquals(new NthAutomorphicNumbers().nthAutomorphicNumbers(2), 1);
		assertEquals(new NthAutomorphicNumbers().nthAutomorphicNumbers(3), 5);
		assertEquals(new NthAutomorphicNumbers().nthAutomorphicNumbers(4), 6);
		assertEquals(new NthAutomorphicNumbers().nthAutomorphicNumbers(5), 25);
		assertEquals(new NthAutomorphicNumbers().nthAutomorphicNumbers(6), 76);
		assertEquals(new NthAutomorphicNumbers().nthAutomorphicNumbers(7), 376);
		assertEquals(new NthAutomorphicNumbers().nthAutomorphicNumbers(8), 625);
		assertEquals(new NthAutomorphicNumbers().nthAutomorphicNumbers(9), 9376);
		assertEquals(new NthAutomorphicNumbers().nthAutomorphicNumbers(10), 90625);
		assertEquals(new NthAutomorphicNumbers().nthAutomorphicNumbers(11), 109376);
		assertEquals(new NthAutomorphicNumbers().nthAutomorphicNumbers(12), 890625);
		assertEquals(new NthAutomorphicNumbers().nthAutomorphicNumbers(13), 2890625);
		assertEquals(new NthAutomorphicNumbers().nthAutomorphicNumbers(14), 7109376);
		assertEquals(new NthAutomorphicNumbers().nthAutomorphicNumbers(15), 12890625);
		assertEquals(new NthAutomorphicNumbers().nthAutomorphicNumbers(16), 87109376);
		assertEquals(new NthAutomorphicNumbers().nthAutomorphicNumbers(17), 212890625);
		assertEquals(new NthAutomorphicNumbers().nthAutomorphicNumbers(18), 787109376);
		assertEquals(new NthAutomorphicNumbers().nthAutomorphicNumbers(19), 1787109376);
		assertEquals(new NthAutomorphicNumbers().nthAutomorphicNumbers(20), 8212890625L);
		assertEquals(new NthAutomorphicNumbers().nthAutomorphicNumbers(21), 18212890625L);
		assertEquals(new NthAutomorphicNumbers().nthAutomorphicNumbers(22), 81787109376L);
		assertEquals(new NthAutomorphicNumbers().nthAutomorphicNumbers(23), 918212890625L);
		assertEquals(new NthAutomorphicNumbers().nthAutomorphicNumbers(24), 9918212890625L);
		assertEquals(new NthAutomorphicNumbers().nthAutomorphicNumbers(25), 40081787109376L);
		assertEquals(new NthAutomorphicNumbers().nthAutomorphicNumbers(26), 59918212890625L);
		assertEquals(new NthAutomorphicNumbers().nthAutomorphicNumbers(27), 259918212890625L);
		assertEquals(new NthAutomorphicNumbers().nthAutomorphicNumbers(28), 740081787109376L);
   }

}

