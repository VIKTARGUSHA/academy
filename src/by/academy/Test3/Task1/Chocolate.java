package by.academy.Test3.Task1;

public class Chocolate extends Product {

    private String flavor;
    private int weight;

    public Chocolate(double quantity, String type, String name, double price, String flavor, int weight) {
        super(quantity, type, name, price);
        this.flavor = flavor;
        this.weight = weight;
    }

    @Override
    public double getDiscount() {
        return 0.9;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "flavor='" + flavor + '\'' +
                ", weight=" + weight +
                '}';
    }
}
