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
		assertEquals(new RemoveDuplicate().removeDuplicate("JavaPython"), "JavPython");
      assertEquals(new RemoveDuplicate().removeDuplicate("HelloWorld"), "HelloWrld");
      assertEquals(new RemoveDuplicate().removeDuplicate("EEE"), "E");
      assertEquals(new RemoveDuplicate().removeDuplicate("a a "), "a ");
   }

   @Test
   public void testCase2() {
      assertEquals(new RemoveDuplicate().removeDuplicate("121212121"), "12");
      assertEquals(new RemoveDuplicate().removeDuplicate(""), "");
      assertEquals(new RemoveDuplicate().removeDuplicate("Test"), "Test");
      assertEquals(new RemoveDuplicate().removeDuplicate("1001"), "10");
      assertEquals(new RemoveDuplicate().removeDuplicate("11110000"), "10");
   }
}

