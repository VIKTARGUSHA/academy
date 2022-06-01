package by.academy.Test7.Task3;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest1 {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        int expected = calculator.add(10, 7);
        int actual = 17;
        assertTrue(actual == expected);
    }
}