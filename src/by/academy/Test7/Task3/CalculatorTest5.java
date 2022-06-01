package by.academy.Test7.Task3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest5 {
    @ParameterizedTest(name = "{index} => a = {0}, b ={1}, c = {2}")
    @MethodSource("someMethod")
    public void add(int a, int b, int c){
        Calculator calculator = new Calculator();
        int expected = calculator.add(a,b);
        int actual = c;
        assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "{index} => a = {0}, b = {1}, c = {2}")
    @MethodSource("someMethodSubtract")
    public void subtract(int a, int b, int c){
        Calculator calculator = new Calculator();
        int expected = calculator.subtract(a,b);
        int actual = c;
        assertEquals(actual, expected);
    }

    @ParameterizedTest(name = "{index} => a = {0}, b = {1}, c = {2}")
    @MethodSource("someMethodDivided")
public void divided(int a, int b, int c){
        Calculator calculator = new Calculator();
        int expected = calculator.divide(a,b);
        int actual = c;
        assertTrue(expected == actual);
    }

    @ParameterizedTest(name = "{index} => a = {0}, b = {1}, c = {2}")
    @MethodSource("someMethodMultiply")
    public void multiply(int a, int b, int c){
        Calculator calculator = new Calculator();
        int expected = calculator.multyply(a,b);
        int actual = c;
        assertTrue(expected == actual);
    }

    private static Stream<Arguments> someMethodMultiply(){
        return Stream.of(Arguments.of(2, 3, 6),
                Arguments.of(3, 3, 9),
                Arguments.of(5, 5, 25)
        );
    }

    private static Stream<Arguments> someMethodDivided(){
        return Stream.of(Arguments.of(5, 2, 2),
                Arguments.of(9, 3, 3),
        Arguments.of(4, 1, 4)
        );
    }

    private static Stream<Arguments> someMethodSubtract(){
        return Stream.of(Arguments.of(3, 2, 1),
                Arguments.of(4,3,1),
                Arguments.of(7, 5, 2)
        );
    }

    private static Stream<Arguments> someMethod() {
        return Stream.of(Arguments.of(1, 2, 3),
                Arguments.of(2, 3, 5),
                Arguments.of(3, 4, 7)
        );
    }
}