package org.example;

public class FibonacciNumbersIteration {
    protected long fibonacci(int n) {
        long firstNumber = 0;
        long secondNumber = 1;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        for (int i = 2; i <= n; i++) {
            long result = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = result;
        }
        return secondNumber;
    }
}
