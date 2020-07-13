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
import static org.junit.Assert.assertTrue;

import java.beans.Transient;
import java.util.*;

public class TestJUnit {

   @Test
   public void testCase1() {
      matrixmultiply s = new matrixmultiply();
      int[][] arr1 = {{1,3}, {2,4},{2,5}};
      int[][] arr2 = {{1,3,2,2},{2,4,5,1}};
      int[][] res1 = {{7,15,17,5}, {10, 22, 24, 8},{12, 26, 29, 9}};
      int[][] arr3 = {{1},{2,4},{2,5}};
      int[][] arr4 = {{1,3,2,2},{2,4,5,1}};
      int[][] res2 = {{}};
      assertTrue("1.",  Arrays.deepEquals(res1, s.fun_matrixmultiply(arr1, arr2)));
      assertTrue("2.",  Arrays.deepEquals(res2, s.fun_matrixmultiply(arr3, arr4)));
   }

   @Test
   public void testCase2() {
      matrixmultiply s = new matrixmultiply();
      int[][] arr1 = {{1,3,5}, {2,4,6},{2,5,7}};
      int[][] arr2 = {{1,3,2,2},{2,4,5,1}};
      int[][] res1 = {{}};
      int[][] arr3 = {{1,3},{2,4}};
      int[][] arr4 = {{1,3,2,2},{2,4,5,1}};
      int[][] res2 = {{7,15,17,5}, {10,22,24,8}};
      assertTrue("1.",  Arrays.deepEquals(res1, s.fun_matrixmultiply(arr1, arr2)));
      assertTrue("2.",  Arrays.deepEquals(res2, s.fun_matrixmultiply(arr3, arr4)));
   }
}

