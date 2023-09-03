package org.example;

import java.util.HashMap;

public class FibonacciNumbersDynamic {
    private static final HashMap<Integer, Long> cache = new HashMap<>();

    protected long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        long fNumber = fibonacci(n - 1) + fibonacci(n - 2);
        cache.put(n, fNumber);
        return fNumber;
    }
}
