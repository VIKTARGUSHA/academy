package by.academy.Test88;

public class Shop {
    private int goodsQuantity = 10;

    public int getGoodsQuantity() {
        return goodsQuantity;
    }

    public void setGoodsQuantity(int goodsQuantity) throws InterruptedException {
        while (goodsQuantity > 10 && goodsQuantity < 0 ){
            wait();
        }
        this.goodsQuantity = goodsQuantityy;
        notify();
    }
}
