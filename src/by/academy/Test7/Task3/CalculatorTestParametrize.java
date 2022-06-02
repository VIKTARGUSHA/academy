package by.academy.Test7.Task3;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CalculatorTestParametrize {

    private int inputFirst;
    private int inputSecond;

    public CalculatorTestParametrize(int a, int b) {
        inputFirst = a;
        inputSecond = b;
    }

    @Before
    public void initialize() {

    }

    @Test
    public void subtract() {
    }

    @Test
    public void add() {
    }

    @Test
    public void multiply() {
    }

    @Test
    public void divided() {
    }

    @Parameterized.Parameters
    public static Collection parametrSet() {
        return Arrays.asList(new Object[][]{{5, 8}, {11, 12}, {48, 2}});
    }
}