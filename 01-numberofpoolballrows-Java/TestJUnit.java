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
		assertEquals(new numberofpoolballrows().fun_numberofpoolballrows(1), 1);
      assertEquals(new numberofpoolballrows().fun_numberofpoolballrows(3), 2);
      assertEquals(new numberofpoolballrows().fun_numberofpoolballrows(6), 3);
      assertEquals(new numberofpoolballrows().fun_numberofpoolballrows(10), 4);
      assertEquals(new numberofpoolballrows().fun_numberofpoolballrows(15), 5);
      assertEquals(new numberofpoolballrows().fun_numberofpoolballrows(21), 6);
      assertEquals(new numberofpoolballrows().fun_numberofpoolballrows(28), 7);
      assertEquals(new numberofpoolballrows().fun_numberofpoolballrows(36), 8);
      assertEquals(new numberofpoolballrows().fun_numberofpoolballrows(45), 9);
      assertEquals(new numberofpoolballrows().fun_numberofpoolballrows(46), 10);
      assertEquals(new numberofpoolballrows().fun_numberofpoolballrows(44), 9);
   }

   @Test
   public void testCase2() {
      assertEquals(new numberofpoolballrows().fun_numberofpoolballrows(55), 10);
      assertEquals(new numberofpoolballrows().fun_numberofpoolballrows(66), 11);
      assertEquals(new numberofpoolballrows().fun_numberofpoolballrows(78), 12);
      assertEquals(new numberofpoolballrows().fun_numberofpoolballrows(91), 13);
      assertEquals(new numberofpoolballrows().fun_numberofpoolballrows(105), 14);
      assertEquals(new numberofpoolballrows().fun_numberofpoolballrows(120), 15);
      assertEquals(new numberofpoolballrows().fun_numberofpoolballrows(5050), 100);
      assertEquals(new numberofpoolballrows().fun_numberofpoolballrows(500500), 1000);
   }
}