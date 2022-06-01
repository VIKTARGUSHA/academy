package by.academy.Test7.Task3;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest extends Assert {

    @org.junit.jupiter.api.Test
    void add() {
        Calculator calculatorAdd = new Calculator(3,10);
        int exspected = calculatorAdd.add(calculatorAdd.x, calculatorAdd.y);
        int actual = 13;
        assertEquals(actual , exspected);
    }


}