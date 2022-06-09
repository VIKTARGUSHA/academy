package by.academy.Test8;

public class TankerAdd implements Runnable {
    PortTerminal portTerminal;
    public TankerAdd(PortTerminal portTerminal){
        this.portTerminal = portTerminal;
    }
    public void run(){

        for (int i = 0; i < 100; i++) {
            try {
                portTerminal.add();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
