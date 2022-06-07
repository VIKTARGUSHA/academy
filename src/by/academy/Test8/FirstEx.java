package by.academy.Test8;

public class FirstEx {
    private int maxPortCapacity = 500;
    private int maxShipCapacity = 100;
    private static int quantityOfConteinersPort = (int) (Math.random() * 448);
    private int quantityOfConteinersShip = (int) (Math.random() * 80+ 20);

    public static void main(String[] args) {
        System.out.println("Initial quantity: " + quantityOfConteinersPort);
        for (int i = 0; i < 100; i++) {
            TankerAdd tankerAdd = new TankerAdd();
            TankerSubtract tankerSubtract = new TankerSubtract();

            tankerAdd.start();
            tankerSubtract.start();

        }
    }

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

    public void setQuantityOfConteinersPort(int quantityOfConteinersPort) {
        FirstEx.quantityOfConteinersPort = FirstEx.quantityOfConteinersPort - quantityOfConteinersShip;
    }

    public void setQuantityOfConteinersPortAdd(int quantityOfConteinersPort) {
        FirstEx.quantityOfConteinersPort = FirstEx.quantityOfConteinersPort + quantityOfConteinersShip;
    }

    public int getQuantityOfConteinersShip() {
        return quantityOfConteinersShip;
    }

    public void setQuantityOfConteinersShip(int quantityOfConteinersShip) {
        this.quantityOfConteinersShip = quantityOfConteinersShip;
    }

}