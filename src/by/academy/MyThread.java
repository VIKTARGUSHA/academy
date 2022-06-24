package by.academy;

public class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 1000; i++){
//            try {
//               // Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println("Hello from MyThread " + i);
        }
    }
}
