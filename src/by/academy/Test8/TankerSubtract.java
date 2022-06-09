package by.academy.Test8;

public class TankerSubtract implements Runnable {
    PortTerminal portTerminal;
    public TankerSubtract(PortTerminal portTerminal){
        this.portTerminal = portTerminal;
    }
    public void run() {

        for (int i = 0; i < 100; i++) {
            try {
                portTerminal.subtract();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}