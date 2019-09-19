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
    public void R1()

    {

        Infection n=new Infection();
        int Expected=1;
        int Actual=n.calculateTotalInfected(1);
        assertEquals(1, Actual);

    }
    @Test
    public void R2()

    {
        Infection n=new Infection();

        int Expected1=10;
        int Actual1=n.calculateInstructors(2);
        assertEquals(10, Actual1);

    }
@Test
    public void R3()

    {
        Infection n=new Infection();
        int Expected=64;
        int Actual2=n.calculateInstructors(7);
        assertEquals(Expected, Actual2);

    }






}