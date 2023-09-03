package org.example;



import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void runTimeDurationTestNanoSec() {
        //Given
        long start = 999;
        long end = 1500;

        //When
        String result = App.runTimeDuration(start, end);

        //Then
        String expected = "Duration(ns): " + (end - start);
        assertEquals(expected, result);
    }
    @Test
    public void runTimeDurationTestMicroSec() {
        //Given
        long start = 999000;
        long end = 1500000;

        //When
        String result = App.runTimeDuration(start, end);

        //Then
        String expected = "Duration(mcs): " + (end - start)/1000;
        assertEquals(expected, result);
    }
    @Test
    public void runTimeDurationTestMilliSec() {
        //Given
        long start = 999000000;
        long end = 1500000000;

        //When
        String result = App.runTimeDuration(start, end);

        //Then
        String expected = "Duration(ms): " + (end - start)/1000000;
        assertEquals(expected, result);
    }
    @Test
    public void runTimeDurationTestSec() {
        //Given
        long start = 999000000000L;
        long end = 1500000000000L;

        //When
        String result = App.runTimeDuration(start, end);

        //Then
        String expected = "Duration(s): " + (end - start)/1000000000;
        assertEquals(expected, result);
    }
}

