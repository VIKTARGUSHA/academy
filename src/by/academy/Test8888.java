package by.academy;

public class Test8888 {
    public static void main(String[] args) throws InterruptedException {
       MyThread myThread = new MyThread();

       MyThread myThread1 = new MyThread();
       myThread.start();
       myThread.join();
   //    Thread.sleep(1000);
       myThread1.start();
//        System.out.println("I'm going to sleep");
//        Thread.sleep(3000);
//        System.out.println("I'm awake");
        System.out.println("Hello from MainThread");

    }
}
