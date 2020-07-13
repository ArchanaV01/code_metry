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
      Element e1 = new Element(1);
      Element e2 = new Element(2);
      Element e3 = new Element(3);
      stacks stack = new stacks(e1);
      stack.push(e2);
      stack.push(e3);
      assertEquals("1.", 3, stack.pop().value);
      assertEquals("2.", 2, stack.pop().value);
      assertEquals("3.", 1, stack.pop().value);
      assertEquals("4.", null, stack.pop());
    }

   @Test
   public void testCase2() {
      Element e4 = new Element(4);
      stacks stack = new stacks(e4);
      assertEquals("1.", 4, stack.pop().value);  
   }

 
}