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
   	StringKeys s = new StringKeys();
   	assertEquals(s.calculate_hash_value("UDACITY"), 8568);
   	assertEquals(s.lookup("UDACITY"), -1);
   }
   @Test
   public void testCase2() {
   	StringKeys s = new StringKeys();
   	assertEquals(s.calculate_hash_value("UDACITY"), 8568);
   	assertEquals(s.lookup("UDACITY"), -1);
   	s.store("UDACITY");
   	assertEquals(s.lookup("UDACITY"), 8568);
   }
   @Test
   public void testCase3() {
   	StringKeys s = new StringKeys();
   	assertEquals(s.calculate_hash_value("UDACIOUS"), 8568);
   	assertEquals(s.lookup("UDACIOUS"), -1);
   }
   @Test
   public void testCase4() {
   	StringKeys s = new StringKeys();
   	assertEquals(s.calculate_hash_value("UDACIOUS"), 8568);
   	assertEquals(s.lookup("UDACIOUS"), -1);
   	s.store("UDACIOUS");
   	assertEquals(s.lookup("UDACIOUS"), 8568);
   }
   
}