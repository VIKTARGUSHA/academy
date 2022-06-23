package by.academy.Test88;

public class MainShop {
    public static void main(String[] args) {


        Shop shop = new Shop();
        Cunsumer cunsumer = new Cunsumer(shop);
        cunsumer.start();
        Suplayer suplayer = new Suplayer(shop);
        suplayer.start();
    }
}
