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
      int[] input_array = {1,3,9,11,15,19,29};
      BinarySearch s = new BinarySearch();
      assertEquals("1.", -1, s.binary_search(input_array,25));
    }

   @Test
   public void testCase2() {
      int[] input_array = {1,3,9,11,15,19,29};
      BinarySearch s = new BinarySearch();
      assertEquals("1.", 4, s.binary_search(input_array,15));  
   }
}