package by.academy.Test8;

public class Terminal1Add extends Thread{
    Port port;
    Ship ship;
    public Terminal1Add( Port port, Ship ship){
        this.port = port;
        this.ship = ship;
    }
    public void run(){
        System.out.println("a1");
        synchronized (port) {
            while (port.getCurrentCapacity() + ship.getShipCapacityAdd() > port.getMaxCapacity()){
                try {
                    System.out.println("add1 wait");
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            port.setCurrentCapacity(port.getCurrentCapacity() + ship.getShipCapacityAdd());
            System.out.println("Terminal1Add is working " + port.getCurrentCapacity() + " Ship data: " +
                    ship.getShipCurrentCapacity() + " " + ship.getShipCapacitySubtract() + " "
                    + ship.getShipCapacityAdd());
            notifyAll();
        }

    }
}
