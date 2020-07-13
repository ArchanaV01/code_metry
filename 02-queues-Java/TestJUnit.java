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
      Queue q = new Queue(1);
      q.enqueue(2);
      q.enqueue(3);
      assertEquals("1.", 1, q.peek());
   }

   @Test
   public void testCase2() {
      Queue q = new Queue(1);
      q.enqueue(2);
      q.enqueue(3);
      assertEquals("1.", 1, q.dequeue());
      q.enqueue(4);
      assertEquals("1.", 2, q.dequeue()); 
      assertEquals("1.", 3, q.dequeue()); 
      assertEquals("1.", 4, q.dequeue());  
   }

 
}