package com.augmentis.ayp.calculater;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class CalculatorUnitTest {
    @Test
    public void test_1_plus_1_equals_2(){
        CalculateTest calculateTest = new CalculateTest();
        calculateTest.pressNumber("1");
        calculateTest.pressOperator("+");
        calculateTest.pressNumber("1");
        calculateTest.pressEqual();
        float calculatorResult = calculateTest.getResult();

        assertEquals(2.00, calculatorResult,0);
    }

    @Test
    public void test_1_plus_2_plus_3_equals_6(){
        CalculateTest calculateTest = new CalculateTest();
        calculateTest.pressNumber("1");
        calculateTest.pressOperator("+");
        calculateTest.pressNumber("2");
        calculateTest.pressOperator("+");
        calculateTest.pressNumber("3");

        calculateTest.pressEqual();
        float calculatorResult = calculateTest.getResult();

        assertEquals(6.00, calculatorResult, 0);
    }

    @Test
    public void test_1_plus_2_minus_3_equals_0(){
        CalculateTest calculateTest = new CalculateTest();
        calculateTest.pressNumber("1");
        calculateTest.pressOperator("+");
        calculateTest.pressNumber("2");
        calculateTest.pressOperator("-");
        calculateTest.pressNumber("3");

        calculateTest.pressEqual();
        float calculatorResult = calculateTest.getResult();

        assertEquals(0, calculatorResult,0);
    }

    @Test
    public void test_1_plus_2_minus_3_multi_4_equals_0(){
        CalculateTest calculateTest = new CalculateTest();
        calculateTest.pressNumber("1");
        calculateTest.pressOperator("+");
        calculateTest.pressNumber("2");
        calculateTest.pressOperator("-");
        calculateTest.pressNumber("3");
        calculateTest.pressOperator("*");
        calculateTest.pressNumber("4");

        calculateTest.pressEqual();
        float calculatorResult = calculateTest.getResult();

        assertEquals(0, calculatorResult, 0);
    }

    @Test
    public void test_0010_plus_0002_equals_12(){
        CalculateTest calculateTest = new CalculateTest();
        calculateTest.pressNumber("0010");
        calculateTest.pressOperator("+");
        calculateTest.pressNumber("0002");

        calculateTest.pressEqual();
        float calculatorResult = calculateTest.getResult();

        assertEquals(12, calculatorResult, 0);
    }

    @Test
    public void test_display(){
        CalculateTest calculateTest = new CalculateTest();
        calculateTest.pressNumber("10");
        calculateTest.pressOperator("+");
        calculateTest.pressNumber("10");
        calculateTest.pressEqual();

        float calculatorResult = calculateTest.getResult();

        assertEquals(12, calculatorResult, 0);
    }
}