package org.softengin;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class MyTheoryTest {
    @DataPoint
    public static String name ="Jack";
    @DataPoint public static String mike ="Mike";

    @Theory
    public void sanity(String name) {
        System.out.println("Sanity check "+name);
    }


    @DataPoints
    public static char[] chars =
            new char[] {'A', 'B', 'C'};
    @Theory
    public void build(char c, char d) {
        System.out.println(c+" "+d);
    }
}
