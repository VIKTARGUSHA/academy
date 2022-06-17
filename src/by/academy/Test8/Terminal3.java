package by.academy.Test8;

public class Terminal3 implements Runnable {
    Store store;

    public Terminal3(Store store) {
        this.store = store;
    }

    // private Integer valume = 0;


    public void run() {
        //  synchronized (valume){
        //  synchronized (store) {
       // synchronized (store) {
            // store.quantityConteiners = 1;

            for (int i = 0; i < 4; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + store.quantityConteiners);
                store.quantityConteiners++;
                //   valume++;
                //  System.out.println(Thread.currentThread().getName() + ": " + store.quantityConteiners);

                //  }
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
          //  }
        }

    }
}
