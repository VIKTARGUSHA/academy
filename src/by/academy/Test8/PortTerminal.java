package by.academy.Test8;

public class PortTerminal {

    private int maxPortCapacity = 500;
    private int maxShipCapacity = 100;
    private static int currentQuantityOfConteiners = (int)(Math.random()*500+1);

    public synchronized void add() throws InterruptedException {
        int shipCapacity = (int) (Math.random() * maxShipCapacity);
        while (maxPortCapacity - currentQuantityOfConteiners < shipCapacity) {
            try {
          //      System.out.println("-----------There are too many conteiners----------------");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Before add port capacity: " + currentQuantityOfConteiners + "   " + "Arraive ship capacity: " + shipCapacity);
        currentQuantityOfConteiners += shipCapacity;
        notify();
        wait(1);
    }

    public synchronized void subtract() throws InterruptedException {
        int shipCapacity = (int) (Math.random() * maxShipCapacity);
        while (currentQuantityOfConteiners - shipCapacity < 0) {
            try {
               // System.out.println("------------There are too little conteuners");
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Before subtract capacity: " + currentQuantityOfConteiners + "  " + "This ship capacity: " + shipCapacity);
        currentQuantityOfConteiners -= shipCapacity;
        notify();
        wait(1);
    }

    public int getCurrentQuantityOfConteiners() {
        return currentQuantityOfConteiners;
    }

    public void setCurrentQuantityOfConteiners(int currentQuantityOfConteiners) {
        this.currentQuantityOfConteiners = currentQuantityOfConteiners;
    }
}