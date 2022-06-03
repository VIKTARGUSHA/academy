package by.academy.Test8;

public class PortClient extends Thread {
    private int maxPortCapacity = 1000;
    private int maxShipCapacity = 20;
    private int quantityOfConteinersPort =(int) (Math.random()*1000);
    private int quantityOfConteinersShip = (int) (Math.random()*20);
    public void run(){
        System.out.println("I'm thread my name is " + getName());
    }
}
