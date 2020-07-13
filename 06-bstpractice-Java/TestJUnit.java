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
   	BST s = new BST(4);
   	assertEquals(s.search(4), true);
   	assertEquals(s.search(6), false);
   }

   @Test
   public void testCase2() {
   	BST s = new BST(4);
	s.insert(2);
	s.insert(1);
	s.insert(3);
	s.insert(5);
   	assertEquals(s.search(5), true);
   	assertEquals(s.search(6), false);
   }

   @Test
   public void testCase3() {
   	BST s = new BST(4);
	s.insert(2);
	s.insert(1);
	s.insert(3);
	s.insert(5);
	s.insert(512);
   	assertEquals(s.search(51), false);
   	assertEquals(s.search(622), false);
   }
}