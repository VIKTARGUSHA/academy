package by.academy.Test8;

public class Terminal2Get extends Thread {
    Port port;
    Ship ship;

    public Terminal2Get(Port port, Ship ship) {
        this.port = port;
        this.ship = ship;
    }

    public void run() {
synchronized (port) {
    while ( 0 > port.getCurrentCapacity() - ship.getShipCapacitySubtract()){
        try {
            System.out.println("get2 wait");
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    port.setCurrentCapacity(port.getCurrentCapacity() - ship.getShipCapacitySubtract());
    System.out.println("Terminal2Get is working " + port.getCurrentCapacity() + " Ship data: " +
            ship.getShipCurrentCapacity()+ " " + ship.getShipCapacitySubtract() + " "
            + ship.getShipCapacityAdd());
    notify();
}
    }
}


