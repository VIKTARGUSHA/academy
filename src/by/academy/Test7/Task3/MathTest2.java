package by.academy.Test7.Task3;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTest2 {
    double actual = 90;
    double expected = Math.abs(-90);

     @Test
    public void mathTest(){
         assertEquals(actual, expected);
     }
}
