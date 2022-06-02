package by.academy.Test7.Task3;

import org.junit.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;
//import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.ParameterizedTest;
import java.util.Arrays;
//import org.junit.jupiter.params.provider.CsvSource;
//import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
@RunWith(Parameterized.class)
public class CalculatorTest3 {



//    @Parameterized.Parameters(name = "{index} => a = {0}, b = {1}, c = {2}")
    @Parameterized.Parameters
    public static Iterable<Object> data() {
        return Arrays.asList(new Object[][]{
                {5, 5, 0},
                {5, 4, 10},
                {7, 8, -1}
        });
    }
    @Parameter(0)
    public int a;
    @Parameter(1)
     public int b;
    @Parameter(2)
     public int c;


@Test
    public void subtract() {
        Calculator calculator = new Calculator();
        int expected = a - b;
        int actual = c;
        assertEquals(expected, actual);
    }
}
//
//    @Parameterized.Parameters(name = "{index} => a = {0}, b = {1}, c = {2}")
//    @CsvSource({"1, 2, 3", "8, 3, 11", "10, 3, 13"})
//   public void add(int a, int b, int c) {
//        Calculator calculator = new Calculator();
//        int expected = a + b;
//        int actual = c;
//        assertEquals(expected, actual);
//    }
//
//    @Parameterized.Parameters(name = "{index} => a = {0}, b = {1}, c = {2}")
//    @CsvSource({"1, 2, 2", "8, 3, 24", "10, 3, 30"})
//    public void multiply(int a, int b, int c) {
//        Calculator calculator = new Calculator();
//        int expected = a * b;
//        int actual = c;
//        assertEquals(expected, actual);
//    }
//
//    @Parameterized.Parameters(name = "{index} => a = {0}, b = {1}, c = {2}")
//    @CsvSource({"1, 2, 0", "8, 3, 2", "10, 3, 3"})
//    void divided(int a, int b, int c) {
//        Calculator calculator = new Calculator();
//        int expected = a / b;
//        int actual = c;
//        assertEquals(expected, actual);
//    }
//}