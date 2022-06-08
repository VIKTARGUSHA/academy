package by.academy.Test8;

public class TankerSubtract extends Thread {
    PortTerminal portTerminal;
    public TankerSubtract(PortTerminal portTerminal){
        this.portTerminal = portTerminal;
    }
    public void run() {
        for (int i = 0; i < 100; i++) {
            portTerminal.subtract();
        }
    }
}