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
    Classy classy = new Classy();
   @Test
   public void testCase1() {
      assertEquals(0, classy.classiness());
   }

   @Test
   public void testCase2() {
       classy.addItem("tophat");
       assertEquals(2, classy.classiness());
   }

   @Test
   public void testCase3() {
       classy.addItem("tophat");
       classy.addItem("bowtie");
       classy.addItem("jacket");
       classy.addItem("monocle");
       assertEquals(11, classy.classiness());
   }

   @Test
   public void testCase4() {
    classy.addItem("tophat");
    classy.addItem("bowtie");
    classy.addItem("jacket");
    classy.addItem("monocle");
    classy.addItem("bowtie");
    assertEquals(15, classy.classiness());
   }
}