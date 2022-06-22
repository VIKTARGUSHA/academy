package by.academy.Test8;

public class Terminal1Get extends Thread {
    Port port;
    Ship ship;

    public Terminal1Get(Port port, Ship ship) {
        this.port = port;
        this.ship = ship;
    }

    public void run() {
        System.out.println("g1");
        synchronized (port) {
            while (0 > port.getCurrentCapacity() - ship.getShipCapacitySubtract()){
                try {
                    System.out.println("get1 wait");
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            port.setCurrentCapacity(port.getCurrentCapacity() - ship.getShipCapacitySubtract());
            System.out.println("Terminal1Get is working " + port.getCurrentCapacity() + " Ship data: " +
                    ship.getShipCurrentCapacity()+ " " + ship.getShipCapacitySubtract() + " "
                    + ship.getShipCapacityAdd());
            notifyAll();
        }

    }
}
