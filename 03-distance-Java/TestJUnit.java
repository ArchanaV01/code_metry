/**
 * 
 * @author: Deepak
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.beans.Transient;

public class TestJUnit {

   @Test
   public void testCase1() {
      distance s = new distance();
      assertEquals("1.", 2, s.fun_distance(0, 0, 0, -2));
      assertEquals("2.", 45, s.fun_distance(-20, 23, -15, 68));
    }

   @Test
   public void testCase2() {
      distance s = new distance();
      assertEquals("1.", 100, s.fun_distance(30, 37, 79, -51));
      assertEquals("2.", 136, s.fun_distance(-69, 63, 57, 11));  
   }
}