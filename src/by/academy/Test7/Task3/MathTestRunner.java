package by.academy.Test7.Task3;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MathTestRunner {
    public static void main(String[] args) {
        Result result =  JUnitCore.runClasses(JUnitTestClass.class);

        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
