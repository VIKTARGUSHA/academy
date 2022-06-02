package by.academy.Test7.Task3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest2 {

    @Test
    public void divide() {
        Calculator calculator = new Calculator();
        int expected = calculator.divide(10,7);
        int actual = 1;
        assertTrue(expected == actual);
    }
}