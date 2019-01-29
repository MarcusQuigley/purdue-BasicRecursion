package com.purduex.quigley;

import static org.junit.Assert.assertEquals;
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

        int result = app.Factorial(4);
        assertEquals(24, result);
    }
}