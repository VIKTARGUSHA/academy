package by.academy.Test8;

public class TankerAdd extends Thread {

    public synchronized void run(){
        for (int i = 0; i < 100; i++) {
            PortTerminal portTerminal = new PortTerminal();
            portTerminal.add();
        }
    }
}
