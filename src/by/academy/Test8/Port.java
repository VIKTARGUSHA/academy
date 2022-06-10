package by.academy.Test8;

public class Port {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Terminal1 terminal1 = new Terminal1();
            Terminal2 terminal2 = new Terminal2();
            terminal1.start();
            terminal2.start();
        }
    }
}