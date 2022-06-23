package by.academy.Test8;

public class Port {
    private int currentCapacity;
    private int maxCapacity = 100;

    public Port(int currentCapacity) {
        this.currentCapacity = currentCapacity;
        System.out.println("Primary port capacity: " + currentCapacity);
    }

    public void loading(Ship ship) throws InterruptedException {
        while (ship.getShipCapacitySubtract() > this.currentCapacity){
            wait();
        }

        this.currentCapacity -= ship.getShipCapacitySubtract();
        notifyAll();
    }

    public void discharge(Ship ship) throws InterruptedException {
        while (this.maxCapacity < this.currentCapacity + ship.getShipCapacityAdd()){
            wait();
        }
        this.currentCapacity += ship.getShipCapacityAdd();
        notifyAll();
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }
}
