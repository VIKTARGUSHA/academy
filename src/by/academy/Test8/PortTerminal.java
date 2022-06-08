package by.academy.Test8;

public class PortTerminal {

    private int maxPortCapacity = 500;
    private int maxShipCapacity = 100;
    private static int currentQuantityOfConteiners = (int)(Math.random()*500+1);

    public synchronized void add() {
        int shipCapacity = (int) (Math.random() * maxShipCapacity);
        while (maxPortCapacity - shipCapacity < shipCapacity) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Before add port capacity: " + currentQuantityOfConteiners + "   " + "Arraive ship capacity: " + shipCapacity);
        currentQuantityOfConteiners += shipCapacity;
        notifyAll();
    }

    public synchronized void subtract() {
        int shipCapacity = (int) (Math.random() * maxShipCapacity);
        while (currentQuantityOfConteiners - shipCapacity < 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Before subtract capacity: " + currentQuantityOfConteiners + "  " + "This ship capacity: " + shipCapacity);
        currentQuantityOfConteiners -= shipCapacity;
        notify();
    }
}