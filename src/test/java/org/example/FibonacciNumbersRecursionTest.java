package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciNumbersRecursionTest {
    @Test
    public void fibonacciTestFor6() {
        //Given
        int n = 6;

        //When
        FibonacciNumbersRecursion fNR = new FibonacciNumbersRecursion();
        long result = fNR.fibonacci(n);

        //Then
        long expected = 8L;
        assertEquals(expected, result);
    }

    @Test
    public void fibonacciTestFor15() {
        //Given
        int n = 15;

        //When
        FibonacciNumbersRecursion fNR = new FibonacciNumbersRecursion();
        long result = fNR.fibonacci(n);

        //Then
        long expected = 610L;
        assertEquals(expected, result);
    }
}
