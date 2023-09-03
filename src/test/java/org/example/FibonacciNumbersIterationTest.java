package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciNumbersIterationTest {
    @Test
    public void fibonacciTestFor6() {
        //Given
        int n = 6;

        //When
        FibonacciNumbersIteration fNI = new FibonacciNumbersIteration();
        long result = fNI.fibonacci(n);

        //Then
        long expected = 8L;
        assertEquals(expected, result);
    }

    @Test
    public void fibonacciTestFor15() {
        //Given
        int n = 15;

        //When
        FibonacciNumbersIteration fNI = new FibonacciNumbersIteration();
        long result = fNI.fibonacci(n);

        //Then
        long expected = 610L;
        assertEquals(expected, result);
    }
}
