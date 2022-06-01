package by.academy.Test7.Task3;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MathTest1 {
    double actual = 25;

    @Test
public void mathTest(){
        double expected = Math.pow(5,2);
        Assertions.assertEquals(actual, expected);
    }
}
