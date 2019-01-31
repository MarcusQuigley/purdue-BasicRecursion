package com.purduex.quigley;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void TestFactorial() {
        App app = new App();

        int result = app.factorial(4);
        assertEquals(24, result);
    }
    @Test
    public  void testPow2n(){
        App a = new App();
       int result =  a.pow2n(3);
       assertEquals(8,result);
    }

    @Test
    public  void testGreatestCommonDivisor(){
    // App a = new App();
     assertEquals(8,App.greatestCommonDivisor(24,16));
        assertEquals(2,App.greatestCommonDivisor(78,32));
    }

    @Test
    public  void testGeometricSeries(){
        assertEquals(2,App.geometricSeries(5));
    }

    @Test
    public  void testIsPalindrome(){
        assertFalse("", App.isPalindrome("Shit"));
        assertTrue("", App.isPalindrome("Navan"));
    }

    @Test
    public  void testIsPalindromeRecursive(){
       // assertFalse("", App.isPalindromeRecursive("Shit"));
        assertTrue("", App.isPalindromeRecursive("Navan"));
    }

    @Test
    public  void testScrambler(){
        assertEquals("eudruP",App.scrambler("Purdue"));
    }
    @Test
    public  void testScrambler2(){
        assertEquals("hsif",App.scrambler("fish"));
    }
    @Test
    public  void testScrambler3(){
        assertEquals("lytcadoretp",App.scrambler("pterodactyl"));
    }
    @Test
    public  void testScrambler4(){
        assertEquals("Purdue",App.scrambler(App.scrambler("Purdue")));
    }
}