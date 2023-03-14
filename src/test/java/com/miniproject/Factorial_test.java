package com.miniproject;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Factorial_test {
    @BeforeClass
    public static void before_test() {
        System.out.println("===============================================");

        System.out.println("starting factorial test");
        System.out.println("===============================================");
    }


    @Test
    public void positive_float() {
       // Calculator calculator = new Calculator();
        System.out.println("test 1) factorial +ve");
        assertEquals("factorial 5 not working correctly",120,Calculator.factorial(5),0.00001);
    }

    @Test
    public void negative_float() {
        //Calculator calculator = new Calculator();
        System.out.println("test 2) factorial -ve");
        assertEquals("factorial -5 not working correctly",-1,Calculator.factorial(-6),0.00001);
      }
}