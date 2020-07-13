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
      alternatingsum s = new alternatingsum();
      int[] arr1 = {5,3,8,4};
      int[] arr2 = {};
      int[] arr3 = {1,2,3,4};
      assertEquals("1.",  6, s.fun_alternatingsum(arr1));
      assertEquals("2.",  0, s.fun_alternatingsum(arr2));
      assertEquals("3.", -2, s.fun_alternatingsum(arr3));
   }


   @Test
   public void testCase2() {
      alternatingsum s = new alternatingsum();
      int[] arr1 = {99,56,23,98,45};
      int[] arr2 = {12,18,16,34,56};
      int[] arr3 = {81,23,90,134};
      assertEquals("1.", 13, s.fun_alternatingsum(arr1));
      assertEquals("2.",  32, s.fun_alternatingsum(arr2));
      assertEquals("2.",  14, s.fun_alternatingsum(arr3));
   }
}

