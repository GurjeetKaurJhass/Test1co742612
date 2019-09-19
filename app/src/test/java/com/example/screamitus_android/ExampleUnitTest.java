package com.example.screamitus_android;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect()

    {

        Infection n=new Infection();
        int Expected=5;
        int Actual=n.calculateTotalInfected(1);
        assertEquals(5, Actual);
    }
}