package by.academy.Test8;

public class Terminal1Add extends Thread {
    Port port;
    Ship ship;

    public Terminal1Add(Port port, Ship ship) {
        this.port = port;
        this.ship = ship;
    }

    public void run() {
        synchronized (port) {
            try {
                port.discharge(ship);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " " + "Terminal1Add is working " + port.getCurrentCapacity() + " Ship data: " +
                    ship.getShipCurrentCapacity() + " " + ship.getShipCapacitySubtract() + " "
                    + ship.getShipCapacityAdd());

        }
    }
}


