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
      LinkedList ll = new LinkedList(e1);
      ll.append(e2);
      ll.append(e3);
      assertEquals("1.", 3, ll.get_position(3).value);
      assertEquals("2.", 2, ll.get_position(2).value);
    }

   @Test
   public void testCase2() {
      Element e1 = new Element(1);
      Element e2 = new Element(2);
      Element e3 = new Element(3);
      LinkedList ll = new LinkedList(e1);
      ll.append(e2);
      ll.append(e3);
      Element e4 = new Element(4);
      ll.insert(e4,3);
      assertEquals("1.", 4, ll.get_position(3).value);  
   }

   @Test
   public void testCase3() {
      Element e1 = new Element(1);
      Element e2 = new Element(2);
      Element e3 = new Element(3);
      LinkedList ll = new LinkedList(e1);
      ll.append(e2);
      ll.append(e3);
      Element e4 = new Element(4);
      ll.insert(e4,3);
      ll.delete(1);
      assertEquals("1.", 2, ll.get_position(1).value);
      assertEquals("2.", 4, ll.get_position(2).value);
      assertEquals("3.", 3, ll.get_position(3).value);  
   }
}