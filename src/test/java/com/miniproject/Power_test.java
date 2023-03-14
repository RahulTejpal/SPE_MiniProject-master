package com.miniproject;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Power_test {
    @BeforeClass
    public static void before_test() {
        System.out.println("===============================================");

        System.out.println("starting power test");
        System.out.println("===============================================");
    }


    @Test
    public void positive_and_positive() {
       // Calculator mycalc = new Calculator();
        System.out.println("test 1) power +ve and +ve integer numbers");
        assertEquals("power of 2 and 3 is not working correctly",8,Calculator.twopower(2f, 3f),0.00001);
    }

    @Test
    public void positive_and_negative() {
        //Calculator mycalc = new Calculator();
        System.out.println("test 2) power +ve and -ve integer numbers");
        assertEquals("power of -2 and 3 is not working correctly",-8,Calculator.twopower(-2f, 3f),0.00001);
    }

    @Test
    public void negative_and_negative() {
        //Calculator mycalc = new Calculator();
        System.out.println("test 3) power -ve and -ve integer numbers");
        assertEquals("power of -0.5 and -3 is not working correctly",-8,Calculator.twopower(-0.5f, -3f),0.00001);
    }
}