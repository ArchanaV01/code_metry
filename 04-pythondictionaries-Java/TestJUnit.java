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
import static org.junit.Assert.assertEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
   		List<String> location = new ArrayList<String>();
   		location.add("Bangalore - India");
   		location.add("Shanghai - China");
		assertEquals(new PythonDictionaries().alphaUSA(), location);
   }

   @Test
   public void testCase2() {
   		List<String> location = new ArrayList<String>();
   		location.add("Atlanta");
   		location.add("Mountain View");
		assertEquals(new PythonDictionaries().sortAsia(), location);
   }
}