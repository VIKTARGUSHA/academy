package by.academy.Test3.Task1;

public class Bread extends Product {
    private String color;

    public Bread(double quantity, String color, String type, String name, double price) {
        super(quantity, type, name, price);
        this.color = color;
    }

    @Override
    public double getDiscount() {
        return 25;
    }
}
