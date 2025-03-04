package org.softengin;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterizedFactorialTest {

    @Parameterized.Parameters(name = "{index}: factorial({0})={1}")
    public static Collection<Object[]> factorialData() {
        return Arrays.asList(new Object[][] {
                { 0, 1 }, { 1, 1 }, { 2, 2 }, { 3, 6 },
                { 4, 24 }, { 5, 120 },{ 6, 720 }
        });
    }

    private int number;
    private int expectedResult;
    public ParameterizedFactorialTest(int input,
                                      int expected) {
        number= input;
        expectedResult= expected;
    }


    @Test
    public void factorial() throws Exception {
        Factorial fact = new Factorial();
        Assert.assertEquals(fact.factorial(number),expectedResult);
    }



}