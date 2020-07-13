/**
 * This is JUnit that tests the methods of the Clock.
 * This contains 2 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and 
 * paste the last three lines of the code (TestCase2).
 * 
 * @author: Deepak
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.beans.Transient;

public class TestJUnit {

   @Test
   public void testCase1() {
      getaverage s = new getaverage();
      assertEquals("1.",  13.5 , s.fun_getaverage("13,excused,14,absent"), 0.01);
      assertEquals("2.",  0.0, s.fun_getaverage("a,b,c"), 0.01);
      assertEquals("3.", 8.0, s.fun_getaverage("a,12,c,14,6,0"), 0.01);
   }


   @Test
   public void testCase2() {
      getaverage s = new getaverage();
      assertEquals("1.", 5.5, s.fun_getaverage("1,2,3,4,5,6,7,8,9,10"), 0.01);
      assertEquals("2.",  10.0, s.fun_getaverage("2,3,ddd4ff,34,1"), 0.01);
   }
}

