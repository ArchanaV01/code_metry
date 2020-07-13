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
		assertEquals(new IsRotated().isRotated("XYZ", "ZXY"), true);
      assertEquals(new IsRotated().isRotated("12345", "54321"), true);
   }

   @Test
   public void testCase2() {
      assertEquals(new IsRotated().isRotated("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "BCDEFGHIJKLMNOPQRSTUVWXYZA"), true);
      assertEquals(new IsRotated().isRotated("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "JKLMNOPQRSTUVWXYZABCDEFGHI"), true);
      assertEquals(new IsRotated().isRotated("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "ACDEFGHIJKLMNOPQRSTUVWXYZB"), false);
      assertEquals(new IsRotated().isRotated("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "BCDEFGHIJKLMNOPQRSTUVWXYZZ"), false);
      assertEquals(new IsRotated().isRotated("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "ABCDEFGHIJKLMNPQRSTUVWXYZ"), false);
      assertEquals(new IsRotated().isRotated("ABCDEFGHIJKLMNOPQRSUVWXYZ", "ABCDEFGHIJKLMNOPQRSTUVWXYZ"), false);
   }
}
