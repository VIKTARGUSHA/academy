package by.academy.Test8;

public class Terminal3 implements Runnable {
    Store store;
    public Terminal3(Store store){
        this.store = store;
    }

    public synchronized void run() {
//synchronized (store){
       // store.quantityConteiners = 1;
            for (int i = 0; i < 4; i++) {

                store.quantityConteiners++;
                System.out.println(Thread.currentThread().getName() + ": " + store.quantityConteiners);
        //    }
            }
    }
}