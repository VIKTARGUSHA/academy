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


    private static Stream<Arguments> someMethod() {
        return Stream.of(Arguments.of(1, 2, 3),
                Arguments.of(2, 3, 5),
                Arguments.of(3, 4, 7)
        );
    }
    private static Stream<Arguments> someMethodSubtract(){
        return Stream.of(Arguments.of(1,3,-2),
                Arguments.of(3,3,0),
                Arguments.of(5,7,-2));
    }
}