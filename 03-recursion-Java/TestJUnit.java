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
       recursion s = new recursion();
       assertEquals("1.", 34, s.get_fib(9));  
    }

    @Test
    public void testCase2() {
       recursion s = new recursion();
       assertEquals("1.", 89, s.get_fib(11));
    }

    @Test
    public void testCase3() {
       recursion s = new recursion();
       assertEquals("3.", 0, s.get_fib(0));
    }

}