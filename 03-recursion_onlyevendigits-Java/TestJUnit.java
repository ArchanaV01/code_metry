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
import static org.junit.Assert.assertArrayEquals;

import java.beans.Transient;

public class TestJUnit {

   @Test
   public void testCase1() {
      recursion_onlyevendigits s = new recursion_onlyevendigits();
      int[] arr1 = {43, 23265, 17, 58344};
      int[] res1 = {4, 226, 0, 844};
      int[] arr2 = {5, 0 , 66, 82, 121};
      int[] res2 = {0, 0, 66, 82, 2};
      assertArrayEquals("1.",  res1, s.fun_recursion_onlyevendigits(arr1));
      assertArrayEquals("2.",  res2, s.fun_recursion_onlyevendigits(arr2));
   }

   @Test
   public void testCase2() {
      recursion_onlyevendigits s = new recursion_onlyevendigits();
      int[] arr1 = {};
      int[] res1 = {};
      int[] arr2 = {332, 81, 11};
      int[] res2 = {2, 8, 0};
      assertArrayEquals("1.",  res1, s.fun_recursion_onlyevendigits(arr1));
      assertArrayEquals("2.",  res2, s.fun_recursion_onlyevendigits(arr2));
   }
}

