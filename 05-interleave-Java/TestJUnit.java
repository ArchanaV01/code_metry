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
      interleave s = new interleave();
      
      assertEquals("1.", "python", s.fun_interleave("pto", "yhn"));
      assertEquals("2.",  "ac#D!f2", s.fun_interleave("a#", "cD!f2"));
      assertEquals("3.", "hweolrllod", s.fun_interleave("hello", "world"));
   }

   @Test
   public void testCase2() {
      interleave s = new interleave();
      
      assertEquals("1.", "ac#De!23r3f", s.fun_interleave("a#e23r3f", "cD!"));
      assertEquals("2.", "ac#Ds!ffg2jsfdeel klsddjlf", s.fun_interleave("a#sfgjfeel klsddjlf", "cD!f2sd")); 
   }
}

