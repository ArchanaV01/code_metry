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
   	BinaryTree s = new BinaryTree(1);
   	s.root.left = new Node(2);
   	s.root.right = new Node(3);
   	s.root.left.left = new Node(4);
   	s.root.left.right = new Node(5);
   	assertEquals(s.search(4), true);
   	assertEquals(s.search(6), false);
   }
    @Test
   public void testCase2() {
   	BinaryTree s = new BinaryTree(1);
   	assertEquals(s.search(4), false);
   	assertEquals(s.search(1), true);
   }
    @Test
   public void testCase3() {
   	BinaryTree s = new BinaryTree(1);
    s.root.left = new Node(1);  
    s.root.left.left = new Node(3);  
    s.root.left.left.left = new Node(7);  
    s.root.left.right = new Node(4);  
    s.root.left.right.left = new Node(8);  
    s.root.left.right.right = new Node(9);  
    s.root.right = new Node(2);  
    s.root.right.left = new Node(5);  
    s.root.right.right = new Node(6);  
   	assertEquals(s.search(4), true);
   	assertEquals(s.search(6), true);
   	assertEquals(s.search(16), false);
   	assertEquals(s.search(8), true);
   }
  
}