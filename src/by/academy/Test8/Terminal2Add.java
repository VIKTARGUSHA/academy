package by.academy.Test8;

public class Terminal2Add implements Runnable {
    Port port;
    Ship ship;
    public Terminal2Add(Port port, Ship ship){
        this.port = port;
        this.ship = ship;
    }
    @Override
    public void run() {
        synchronized (port) {
            while (port.getMaxCapacity() < port.getCurrentCapacity() + ship.getShipCapacityAdd()){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            port.setCurrentCapacity(port.getCurrentCapacity() + ship.getShipCapacityAdd());
            System.out.println("Terminal2Add is working " + port.getCurrentCapacity() + " Ship data: " +
                    ship.getShipCurrentCapacity() + " " + ship.getShipCapacitySubtract() + " "
                    + ship.getShipCapacityAdd());
            notify();
        }
    }
}
