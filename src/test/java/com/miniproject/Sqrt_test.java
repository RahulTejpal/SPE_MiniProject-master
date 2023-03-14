package com.miniproject;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Sqrt_test {
    @BeforeClass
    public static void before_test() {
        System.out.println("===============================================");

        System.out.println("starting square root test");
        System.out.println("===============================================");
    }


    @Test
    public void positive_float() {
        //Calculator mycalc = new Calculator();
        System.out.println("test 1) square root +ve");
        assertEquals("square root 25 not working correctly",5,Calculator.squareroot(25),0.00001);
    }

    @Test
    public void negative_float() {
        //Calculator mycalc = new Calculator();
        System.out.println("test 2) square root -ve");
        assertEquals("square root -5 not working correctly",-1,Calculator.squareroot(-6),0.00001);
    }
}