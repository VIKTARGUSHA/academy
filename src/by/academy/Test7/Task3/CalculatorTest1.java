package by.academy.Test7.Task3;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest1 {

    @Test
    public void add() {
        Calculator calculator = new Calculator();
        int expected = calculator.add(10, 7);
        int actual = 17;
        assertTrue(actual == expected);
    }
}