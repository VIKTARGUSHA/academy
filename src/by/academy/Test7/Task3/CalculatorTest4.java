package by.academy.Test7.Task3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest4 {

    @ParameterizedTest(name = "{index} => a = {0},  b = {1}, c = {2}")
    @CsvFileSource(resources = "testData.csv")
    void subtract(int a, int b, int c) {
        Calculator calculator = new Calculator();
        int expected = calculator.subtract(a, b);
        int actual = c;
        assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "{index} => a = {0}, b = {1}, c = {2}")
    @CsvFileSource(resources = "testData1.csv")
    void add(int a, int b, int c) {
        Calculator calculator = new Calculator();
        int expected = calculator.add(a, b);
        int actual = c;
        assertEquals(actual, expected);
    }

    @ParameterizedTest(name = "{index} => a = {0}, b = {1}, c = {2}")
    @CsvFileSource(resources = "testDateMultiply.csv")
    void multyply(int a, int b, int c) {
        Calculator calculator = new Calculator();
        int expected = a * b;
        int actual = c;
        assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "{index} => a = {0}, b = {1}, c = {2}")
    @CsvFileSource(resources = "testDateDivided.csv")
    void divide(int a, int b, int c) {
        Calculator calculator = new Calculator();
        int expected = a / b;
        int actual = c;
        assertEquals(expected, actual);
    }
}