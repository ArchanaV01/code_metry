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
        assertEquals(new NthCircularPrime().nthCircularPrime(1), 2);
        assertEquals(new NthCircularPrime().nthCircularPrime(2), 3);
        assertEquals(new NthCircularPrime().nthCircularPrime(3), 5);
        assertEquals(new NthCircularPrime().nthCircularPrime(4), 7); 
        assertEquals(new NthCircularPrime().nthCircularPrime(5), 13);
        assertEquals(new NthCircularPrime().nthCircularPrime(6), 17);
        assertEquals(new NthCircularPrime().nthCircularPrime(7), 31);
        assertEquals(new NthCircularPrime().nthCircularPrime(8), 37); 
        assertEquals(new NthCircularPrime().nthCircularPrime(9), 71);
        assertEquals(new NthCircularPrime().nthCircularPrime(10), 73);
        assertEquals(new NthCircularPrime().nthCircularPrime(11), 79);
        assertEquals(new NthCircularPrime().nthCircularPrime(12), 97); 
        assertEquals(new NthCircularPrime().nthCircularPrime(13), 113);
        assertEquals(new NthCircularPrime().nthCircularPrime(14), 131);
        assertEquals(new NthCircularPrime().nthCircularPrime(15), 197);
        assertEquals(new NthCircularPrime().nthCircularPrime(16), 199); 
        assertEquals(new NthCircularPrime().nthCircularPrime(17), 311);
        assertEquals(new NthCircularPrime().nthCircularPrime(18), 337);
        assertEquals(new NthCircularPrime().nthCircularPrime(19), 373);
        assertEquals(new NthCircularPrime().nthCircularPrime(20), 719); 
        assertEquals(new NthCircularPrime().nthCircularPrime(21), 733);
        assertEquals(new NthCircularPrime().nthCircularPrime(22), 919);
        assertEquals(new NthCircularPrime().nthCircularPrime(23), 971);
        assertEquals(new NthCircularPrime().nthCircularPrime(24), 991); 
        assertEquals(new NthCircularPrime().nthCircularPrime(25), 1193);
        assertEquals(new NthCircularPrime().nthCircularPrime(26), 1931);
        assertEquals(new NthCircularPrime().nthCircularPrime(27), 3119);
        assertEquals(new NthCircularPrime().nthCircularPrime(28), 3779); 
        assertEquals(new NthCircularPrime().nthCircularPrime(29), 7793);
        assertEquals(new NthCircularPrime().nthCircularPrime(30), 7937);
        assertEquals(new NthCircularPrime().nthCircularPrime(31), 9311);
        assertEquals(new NthCircularPrime().nthCircularPrime(32), 9377); 
        assertEquals(new NthCircularPrime().nthCircularPrime(33), 11939);
        assertEquals(new NthCircularPrime().nthCircularPrime(34), 19391);
        assertEquals(new NthCircularPrime().nthCircularPrime(35), 19937);
        assertEquals(new NthCircularPrime().nthCircularPrime(36), 37199); 
        assertEquals(new NthCircularPrime().nthCircularPrime(37), 39119);
        assertEquals(new NthCircularPrime().nthCircularPrime(38), 71993);
        assertEquals(new NthCircularPrime().nthCircularPrime(39), 91193);
        assertEquals(new NthCircularPrime().nthCircularPrime(40), 93719); 
        assertEquals(new NthCircularPrime().nthCircularPrime(41), 93911);
        assertEquals(new NthCircularPrime().nthCircularPrime(42), 99371);
        assertEquals(new NthCircularPrime().nthCircularPrime(43), 193939);
        assertEquals(new NthCircularPrime().nthCircularPrime(44), 199933); 
        assertEquals(new NthCircularPrime().nthCircularPrime(45), 319993);
        assertEquals(new NthCircularPrime().nthCircularPrime(46), 331999);
        assertEquals(new NthCircularPrime().nthCircularPrime(47), 391939); 
   }
}
