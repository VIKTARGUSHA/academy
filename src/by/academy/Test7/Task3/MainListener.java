package by.academy.Test7.Task3;


import org.junit.runner.JUnitCore;

public class MainListener {
    public static void main(String[] args) {
        JUnitCore runner = new JUnitCore();
        runner.addListener(new CalculatorTestListener());
        runner.run(CalculatorTest1.class, CalculatorTest2.class, CalculatorTest3.class );
    }
}
