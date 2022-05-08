package by.academy.Test3.Task1;

public abstract class Product {
    protected double quantity;
    protected String type;
    protected String name;
    protected double price;

    public Product(double quantity, String type, String name, double price) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {
    }

    public double getColculatedPrice() {
        return price * quantity * getDiscount();
    }

    public abstract double getDiscount();

    @Override
    public String toString() {
        return "Product{" +
                "quantity=" + quantity +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}

