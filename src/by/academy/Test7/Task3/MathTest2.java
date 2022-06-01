package by.academy.Test7.Task3;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathTest2 {
    double actual = 90;
    double expected = Math.abs(-90);

     @Test
    public void mathTest(){
         Assertions.assertEquals(actual, expected);
     }
}
