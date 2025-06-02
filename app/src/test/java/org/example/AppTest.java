package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AppTest {

    @Test
    public void testNaivePower() {
        assertEquals(8, App.naivePower(2, 3));
        assertEquals(1, App.naivePower(5, 0));
        assertEquals(0, App.naivePower(0, 5));
    }

    @Test
    public void testUnoptimizedDCPower() {
        assertEquals(8, App.unoptimizedDCPower(2, 3));
        assertEquals(1, App.unoptimizedDCPower(7, 0));
        assertEquals(0, App.unoptimizedDCPower(0, 10));
    }

    @Test
    public void testOptimizedDCPower() {
        assertEquals(8, App.optimizedDCPower(2, 3));
        assertEquals(1, App.optimizedDCPower(4, 0));
        assertEquals(0, App.optimizedDCPower(0, 4));
    }
}

