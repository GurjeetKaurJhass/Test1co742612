package com.example.screamitus_android;

public class Infection {
//R1 number of days must be greater than 0
    public int calculateTotalInfected(int day)
    {
        if(day>=0)
        {

            return day;
        }
       else
        {
            return -1;
        }
    }

    public int calculateInstructors(int day)
    {

        if (day>7) {
            int instructors = 8;
            int actual_infected = instructors * day;
            return actual_infected;
        }

        else
        {
            int instructors = 5;
            int actual_infected1 =instructors*day;
            return actual_infected1;
        }
    }




}
