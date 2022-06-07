package by.academy.Test8;

public class TankerAdd extends Thread {

    public synchronized void run(){
        FirstEx firstEx = new FirstEx();
        int quantityConteinersThisShip = (int)(Math.random()*firstEx.getMaxShipCapacity());
        while(firstEx.getMaxPortCapacity() - firstEx.getQuantityOfConteinersPort() < quantityConteinersThisShip){
            try {
                System.out.println("Ther is too many conteiners " + firstEx.getQuantityOfConteinersPort() + "\n" + "This ship carryies: " + quantityConteinersThisShip + "\n" + "      " + (firstEx.getMaxPortCapacity() - firstEx.getQuantityOfConteinersPort()));
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        firstEx.setQuantityOfConteinersPortAdd(quantityConteinersThisShip);
        System.out.println(firstEx.getQuantityOfConteinersPort());
        notify();
    }
}
