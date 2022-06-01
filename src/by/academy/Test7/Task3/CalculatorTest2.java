package by.academy.Test7.Task3;



import org.junit.Assert;
import org.junit.jupiter.api.Test;


import static org.junit.Assert.*;

public class CalculatorTest2{

    @Test
    public void multiply(){
        Calculator calculatorMultiply = new Calculator();
        Assert.assertTrue(calculatorMultiply.multiply(10,20) == 200);
    }
}