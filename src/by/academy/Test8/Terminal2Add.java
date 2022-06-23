package by.academy.Test8;

public class Terminal2Add implements Runnable {
    Port port;
    Ship ship;

    public Terminal2Add(Port port, Ship ship) {
        this.port = port;
        this.ship = ship;
    }

    @Override
    public void run() {
        synchronized (port) {

            try {
                port.discharge(ship);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            System.out.println(Thread.currentThread().getName() + " " + "Terminal2Add is working " + port.getCurrentCapacity() + " Ship data: " +
                    ship.getShipCurrentCapacity() + " " + ship.getShipCapacitySubtract() + " "
                    + ship.getShipCapacityAdd());
        }
    }
}

