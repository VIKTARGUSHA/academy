package by.academy.Test8;

public class TankerAdd extends Thread {
    PortTerminal portTerminal;
    public TankerAdd(PortTerminal portTerminal){
        this.portTerminal = portTerminal;
    }
    public synchronized void run(){
        for (int i = 0; i < 100; i++) {
            portTerminal.add();
        }
    }
}
