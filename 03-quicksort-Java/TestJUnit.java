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
import java.util.*;
import java.beans.Transient;

public class TestJUnit {

   @Test
   public void testCase1() {
      int[] input_array = {21, 4, 1, 3, 9, 20, 25, 6, 21, 14};
      int[] output_array= {1, 3, 4, 6, 9, 14, 20, 21, 21, 25};
      QuickSort s = new QuickSort();
      assertEquals("1.", Arrays.toString(output_array), Arrays.toString(s.quicksort(input_array)));
    }
    
}