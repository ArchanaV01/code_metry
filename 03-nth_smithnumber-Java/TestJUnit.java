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
		assertEquals(new nth_smithnumber().fun_nth_smithnumber(0), 4);
      assertEquals(new nth_smithnumber().fun_nth_smithnumber(1), 22);
      assertEquals(new nth_smithnumber().fun_nth_smithnumber(2), 27);
      assertEquals(new nth_smithnumber().fun_nth_smithnumber(5), 94);
   }

   @Test
   public void testCase2() {
     assertEquals(new nth_smithnumber().fun_nth_smithnumber(10), 274);
      assertEquals(new nth_smithnumber().fun_nth_smithnumber(15), 382);
      assertEquals(new nth_smithnumber().fun_nth_smithnumber(17), 438);
      assertEquals(new nth_smithnumber().fun_nth_smithnumber(19), 483);
   }
}