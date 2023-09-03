package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciNumbersDynamicTest {
    @Test
    public void fibonacciTestFor6() {
        //Given
        int n = 6;

        //When
        FibonacciNumbersDynamic fND = new FibonacciNumbersDynamic();
        long result = fND.fibonacci(n);

        //Then
        long expected = 8L;
        assertEquals(expected, result);
    }

    @Test
    public void fibonacciTestFor15() {
        //Given
        int n = 15;

        //When
        FibonacciNumbersDynamic fND = new FibonacciNumbersDynamic();
        long result = fND.fibonacci(n);

        //Then
        long expected = 610L;
        assertEquals(expected, result);
    }
}
