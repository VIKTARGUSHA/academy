package by.academy.Test7.Task3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest3 {

    @ParameterizedTest(name = "{index} => a = {0}, b = {1}, c = {2}")
    @CsvSource({"1, 2, -1", "8, 3, 5", "10, 3, 7"})
    void subtract(int a, int b, int c) {
        Calculator calculator = new Calculator();
        int expected = a - b;
        int actual = c;
        assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "{index} => a = {0}, b = {1}, c = {2}")
    @CsvSource({"1, 2, 3", "8, 3, 11", "10, 3, 13"})
    void add(int a, int b, int c) {
        Calculator calculator = new Calculator();
        int expected = a + b;
        int actual = c;
        assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "{index} => a = {0}, b = {1}, c = {2}")
    @CsvSource({"1, 2, 2", "8, 3, 24", "10, 3, 30"})
    void multiply(int a, int b, int c) {
        Calculator calculator = new Calculator();
        int expected = a * b;
        int actual = c;
        assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "{index} => a = {0}, b = {1}, c = {2}")
    @CsvSource({"1, 2, 0", "8, 3, 2", "10, 3, 3"})
    void divided(int a, int b, int c) {
        Calculator calculator = new Calculator();
        int expected = a / b;
        int actual = c;
        assertEquals(expected, actual);
    }
}