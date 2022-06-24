package by.academy.Test8;

public class Terminal2Pass extends Thread {
    Port port;
    Ship ship;

    public Terminal2Pass(Port port, Ship ship) {
        this.port = port;
        this.ship = ship;
    }

    public void run() {
        synchronized (port) {
            try {
                port.loading(ship);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            System.out.println(Thread.currentThread().getName() + " " + "Terminal2Pass is working " + port.getCurrentCapacity() + " Ship data: " +
                    ship.getShipCurrentCapacity() + " " + ship.getShipCapacitySubtract() + " "
                    + ship.getShipCapacityAdd());

        }
    }
}




