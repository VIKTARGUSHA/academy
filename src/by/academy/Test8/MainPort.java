package by.academy.Test8;

public class MainPort {
    public static void main(String[] args) {
        PortTerminal portTerminal = new PortTerminal();
        System.out.println("Initial quantity: " + portTerminal.getCurrentQuantityOfConteiners() );
        TankerAdd tankerAdd = new TankerAdd(portTerminal);
        TankerSubtract tankerSubtract = new TankerSubtract(portTerminal);
        tankerAdd.start();
        tankerSubtract.start();
    }
}