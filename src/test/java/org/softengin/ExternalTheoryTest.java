package org.softengin;

import org.junit.experimental.theories.ParametersSuppliedBy;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Theories.class)
public class ExternalTheoryTest {

    @Theory
    public void adds_numbers(
            @ParametersSuppliedBy(NumberSupplier.class) Number num1,
            @ParametersSuppliedBy(NumberSupplier.class) Number num2)
    {
        System.out.println(num1 + " and " + num2);
    }


    @Theory
    public void adds_numbers_assert(
            @ParametersSuppliedBy(NumberSupplier.class) Number num1,
            @ParametersSuppliedBy(NumberSupplier.class) Number num2) {
        Adder anAdder = new Adder();
        double expectedSum =
                num1.doubleValue()+num2.doubleValue();
        double actualResult = (Double)anAdder.add(num1, num2);
        assertEquals(actualResult, expectedSum, 0.01);
    }
}
