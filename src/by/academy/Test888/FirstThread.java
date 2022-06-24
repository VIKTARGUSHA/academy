package by.academy.Test888;

public class FirstThread implements Runnable{
    @Override
    public void run() {

        for (int i = 0; i < 100; i++){
            System.out.println("First Thread" + i);
 //           try {
//                Thread.currentThread().join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }


        }
    }
}
