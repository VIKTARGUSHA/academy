package by.academy.Test7.Task3;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        int expected = calculator.subtract(10, 7);
        int actual  = 3;
        assertEquals(expected, actual);
    }
}