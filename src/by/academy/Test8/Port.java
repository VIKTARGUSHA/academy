package by.academy.Test8;

public class Port {
    private int currentCapacity;
    private int maxCapacity;
    public Port(int currentCapacity){
        this.currentCapacity = currentCapacity;
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
