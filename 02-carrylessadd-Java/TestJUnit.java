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
		assertEquals(new carrylessadd().fun_carrylessadd(1,2), 3);
      assertEquals(new carrylessadd().fun_carrylessadd(785, 376), 51);
      assertEquals(new carrylessadd().fun_carrylessadd(99, 1), 90);
   }

   @Test
   public void testCase2() {
      assertEquals(new carrylessadd().fun_carrylessadd(33,77), 0);
      assertEquals(new carrylessadd().fun_carrylessadd(121,0), 121);
   }
}