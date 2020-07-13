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
import static org.junit.Assert.assertArrayEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
      assertArrayEquals(new MatrixAdd().matrixAdd(new int[][]{{1,  2,  3},{4,  5,  6}}, new int[][]{{21, 22, 23}, {24, 25, 26}}),new int[][]{{23, 24, 26},{28, 30, 32}});
      assertArrayEquals(new MatrixAdd().matrixAdd(new int[][]{{1,  2,  3},{4,  5,  6}, {7, 8, 9}}, new int[][]{{1,  2,  3},{4,  5,  6}, {7, 8, 9}}), new int[][]{{2, 4, 6},{8, 10, 12}, {14, 16, 18}});
      assertArrayEquals(new MatrixAdd().matrixAdd(new int[][]{{1,  2,  3},{4,  5,  6}}, new int[][]{{21, 22, 23}, {24, 25}}), null);
   }
}

