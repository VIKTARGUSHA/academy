package by.academy.Test7.Task3;


//import org.junit.jupiter.api.Test;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MathTest1 {
    double actual = 25;

    @Test
    public void mathTest() {
        double expected = Math.pow(5, 2);
        assertEquals(actual, expected);
    }
}