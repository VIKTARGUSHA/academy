package by.academy.Test8;

public class firstEx {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            PortClient portClient = new PortClient();
            PortClient1 portClient1 = new PortClient1();
            portClient.start();
            portClient1.start();

        }
    }
}