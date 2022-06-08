package by.academy.Test8;

public class FirstEx {
    private int maxPortCapacity = 500;
    private int maxShipCapacity = 100;
    private static int quantityOfConteinersPort = (int) (Math.random() * 448);
    private int quantityOfConteinersShip = (int) (Math.random() * 80+ 20);

    public int getMaxPortCapacity() {
        return maxPortCapacity;
    }

    public void setMaxPortCapacity(int maxPortCapacity) {
        this.maxPortCapacity = maxPortCapacity;
    }

    public int getMaxShipCapacity() {
        return maxShipCapacity;
    }

    public void setMaxShipCapacity(int maxShipCapacity) {
        this.maxShipCapacity = maxShipCapacity;
    }

    public int getQuantityOfConteinersPort() {
        return quantityOfConteinersPort;
    }

    public void setQuantityOfConteinersPort(int quantityOfConteinersShipSubtract) {
        FirstEx.quantityOfConteinersPort = FirstEx.quantityOfConteinersPort - quantityOfConteinersShipSubtract;
    }

    public void setQuantityOfConteinersPortAdd(int quantityOfConteinersShipAdd) {
        FirstEx.quantityOfConteinersPort = FirstEx.quantityOfConteinersPort + quantityOfConteinersShipAdd;
    }

    public int getQuantityOfConteinersShip() {
        return quantityOfConteinersShip;
    }

    public void setQuantityOfConteinersShip(int quantityOfConteinersShip) {
        this.quantityOfConteinersShip = quantityOfConteinersShip;
    }

}