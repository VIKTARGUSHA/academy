package by.academy.Test88;

public class Suplayer extends Thread {
    Shop shop;

    public Suplayer(Shop shop) {
        this.shop = shop;
    }

    public void run() {
       // for (int i = 0; i < 25; i++) {
            synchronized (shop) {

                try {
                    shop.supply();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + "Syplayer " + shop.getGoodsQuantity());
            }
      //  }
    }
}