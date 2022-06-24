package by.academy.Test88;

public class Shop {
    private int goodsQuantity = 9;

    public void supply() throws InterruptedException {
        while (goodsQuantity >= 10){
            wait();
        }
        goodsQuantity +=1;
        notify();
    }

    public void cunsumer() throws InterruptedException {
        while (goodsQuantity <= 0){
            wait();
        }
        goodsQuantity -=1;
        notify();
    }

    public int getGoodsQuantity() {
        return goodsQuantity;
    }
}
