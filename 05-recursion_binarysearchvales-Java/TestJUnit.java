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
import static org.junit.Assert.assertEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
      assertEquals(new BinarySearchValues().binarySearchValues(new char[]{'a', 'c', 'f', 'g', 'm', 'q'}, 'a'), "[(2, f), (0, a)]");
      assertEquals(new BinarySearchValues().binarySearchValues(new char[]{'a', 'c', 'f', 'g', 'm', 'q'}, 'c'), "[(2, f), (0, a), (1, c)]");
      assertEquals(new BinarySearchValues().binarySearchValues(new char[]{'a', 'c', 'f', 'g', 'm', 'q'}, 'f'), "[(2, f)]");
      assertEquals(new BinarySearchValues().binarySearchValues(new char[]{'a', 'c', 'f', 'g', 'm', 'q'}, 'g'), "[(2, f), (4, m), (3, g)]");
   }

   @Test
   public void testCase2() {
      assertEquals(new BinarySearchValues().binarySearchValues(new char[]{'a', 'c', 'f', 'g', 'm', 'q'}, 'm'), "[(2, f), (4, m)]");
      assertEquals(new BinarySearchValues().binarySearchValues(new char[]{'a', 'c', 'f', 'g', 'm', 'q'}, 'q'), "[(2, f), (4, m), (5, q)]");
      assertEquals(new BinarySearchValues().binarySearchValues(new char[]{'a', 'c', 'f', 'g', 'm', 'q'}, 'z'), "[(2, f), (4, m), (5, q)]");
      assertEquals(new BinarySearchValues().binarySearchValues(new char[]{'a', 'c', 'f', 'g', 'm', 'q'}, 'b'), "[(2, f), (0, a), (1, c)]");
   }
}
