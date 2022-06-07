package by.academy.Test8;

public class TankerSubtract extends Thread{
    @Override
    public synchronized void run(){
        FirstEx firstEx = new FirstEx();
        int quantityOfConteinersShippingThisShip = (int) (Math.random() * firstEx.getMaxShipCapacity());
        while (firstEx.getQuantityOfConteinersPort() - quantityOfConteinersShippingThisShip < 0){
            try {
                System.out.println("Oo there are too litle conteiners in the warehouse" + firstEx.getQuantityOfConteinersPort() + "\n" + " This ship carryies: " +quantityOfConteinersShippingThisShip );
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        firstEx.setQuantityOfConteinersPort( quantityOfConteinersShippingThisShip);
        System.out.println(firstEx.getQuantityOfConteinersPort());
        notify();
    }
}
