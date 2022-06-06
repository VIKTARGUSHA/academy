package by.academy.Test8;

public class TankerAdd extends Thread {

    public void run(){
        FirstEx firstEx = new FirstEx();
        firstEx.setQuantityOfConteinersPortAdd((int)(Math.random()*firstEx.getMaxShipCapacity()));
        System.out.println(firstEx.getQuantityOfConteinersPort());
    }
}
