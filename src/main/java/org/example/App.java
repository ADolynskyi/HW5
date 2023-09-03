package org.example;

import java.util.Scanner;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class App {
    private static final Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) {
        LogManager.getRootLogger().setLevel(Level.INFO);
        Scanner scanner = new Scanner(System.in);
        logger.info("Enter the number");
        int number = scanner.nextInt();
        String message;

        long start = System.nanoTime();
        FibonacciNumbersIteration fNI = new FibonacciNumbersIteration();
        long fNumberIteration = fNI.fibonacci(number);
        long end = System.nanoTime();
        message = runTimeDuration(start, end);
        logger.info(message);
        logger.info("Fibonacci number iteration " + fNumberIteration);

        long startR = System.nanoTime();
        FibonacciNumbersRecursion fNR = new FibonacciNumbersRecursion();
        long fNumberRecursion = fNR.fibonacci(number);
        long endR = System.nanoTime();
        message = runTimeDuration(startR, endR);
        logger.info(message);
        logger.info("Fibonacci number recursion " + fNumberRecursion);

        long startD = System.nanoTime();
        FibonacciNumbersDynamic fND = new FibonacciNumbersDynamic();
        long fNumberDynamic = fND.fibonacci(number);
        long endD = System.nanoTime();
        message = runTimeDuration(startD, endD);
        logger.info(message);
        logger.info("Fibonacci number dynamic " + fNumberDynamic);
        scanner.close();
    }

    public static String runTimeDuration(long start, long end) {
        final long ONE_MICRO_SECOND = 1000;
        final long ONE_MILLI_SECOND = 1000000;
        final long ONE_SECOND = 1000000000;

        String message;
        long duration = end - start;
        if (duration < ONE_MICRO_SECOND) {
            message = "Duration(ns): " + duration;
        } else if (duration < ONE_MILLI_SECOND) {
            message = "Duration(mcs): " + duration / ONE_MICRO_SECOND;
        } else if (duration < ONE_SECOND) {
            message = "Duration(ms): " + duration / ONE_MILLI_SECOND;
        } else {
            message = "Duration(s): " + duration / ONE_SECOND;
        }
        return message;

    }
}
