package by.academy.Test8;

public class TankerSubtract extends Thread{
    @Override
    public void run(){
        FirstEx firstEx = new FirstEx();
        firstEx.setQuantityOfConteinersPort((int) (Math.random() * firstEx.getMaxShipCapacity()));
        System.out.println(firstEx.getQuantityOfConteinersPort());
    }
}
