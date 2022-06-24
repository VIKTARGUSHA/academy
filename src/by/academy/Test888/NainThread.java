package by.academy.Test888;

public class NainThread {
    public static void main(String[] args) throws InterruptedException {


        FirstThread firstThread = new FirstThread();
        SecondThread secondThread = new SecondThread();
        Thread thread1 = new Thread(firstThread);
        Thread thread2 = new Thread(secondThread);

      //  thread1.join();
        thread2.start();

        thread2.join();
        thread1.start();
        //Thread.currentThread().join();
        System.out.println("Hello it's me--------------------- ");
    }
}