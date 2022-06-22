package by.academy.Test8;

public class Ship {
    private int shipCapacityAdd;
    private int shipCapacitySubtract;
    private int shipCurrentCapacity;
    static int maxCapacityShip = 20;
    public Ship(int shipCurrentCapacity, int shipCapacityAdd, int shipCapacitySubtract){
        this.shipCapacityAdd = shipCapacityAdd;
        this.shipCapacitySubtract = shipCapacitySubtract;
        this.shipCurrentCapacity = shipCurrentCapacity;
    }

    public int getShipCurrentCapacity() {
        return shipCurrentCapacity;
    }

    public void setShipCurrentCapacity(int shipCurrentCapacity) {
        this.shipCurrentCapacity = shipCurrentCapacity;
    }

    public int getShipCapacityAdd() {
        return shipCapacityAdd;
    }

    public void setShipCapacityAdd(int shipCapacityAdd) {
        this.shipCapacityAdd = shipCapacityAdd;
    }

    public int getShipCapacitySubtract() {
        return shipCapacitySubtract;
    }

    public void setShipCapacitySubtract(int shipCapacitySubtract) {
        this.shipCapacitySubtract = shipCapacitySubtract;
    }

    public int getMaxCapacityShip() {
        return maxCapacityShip;
    }
}
