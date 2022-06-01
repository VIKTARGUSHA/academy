package by.academy.Test7.Task3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest1 extends Assert {

    @Test
    public void subtract() {
        Calculator calculator = new Calculator(2,8);
int expected = calculator.subtract(2, 8);
int actual = -6;
assertTrue(expected == actual);
    }

}