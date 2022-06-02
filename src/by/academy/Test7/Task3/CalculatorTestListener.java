package by.academy.Test7.Task3;


import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class CalculatorTestListener extends RunListener {
    @Override
    public void testRunFinished(Result result){
        System.out.println("Hello it's the testRunFinished");
    }
    @Override
    public  void testRunStarted(Description description){
        System.out.println("Hello, test started ");
    }
    @Override
    public void testStarted(Description description){
        System.out.println("One more test started");
    }
    @Override
    public void testFinished(Description description){
        System.out.println("One more test finished");
    }
    @Override
    public void testFailure(Failure failure) throws Exception{
        System.out.println(failure.getMessage());
    }
}
