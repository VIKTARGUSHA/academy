package by.academy.Test8;

public class PortTerminal {

    private int maxPortCapacity = 500;
    private int maxShipCapacity = 100;
    private static int currentQuantityOfConteiners = (int)(Math.random()*500+1);

    public synchronized void add() {
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
    }

    public synchronized void subtract() {
        int shipCapacity = (int) (Math.random() * maxShipCapacity);
        while (currentQuantityOfConteiners - shipCapacity < 0) {
            try {
               // System.out.println("------------There are too little conteuners");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Before subtract capacity: " + currentQuantityOfConteiners + "  " + "This ship capacity: " + shipCapacity);
        currentQuantityOfConteiners -= shipCapacity;
        notify();
    }

    public int getCurrentQuantityOfConteiners() {
        return currentQuantityOfConteiners;
    }

    public void setCurrentQuantityOfConteiners(int currentQuantityOfConteiners) {
        PortTerminal.currentQuantityOfConteiners = currentQuantityOfConteiners;
    }
}