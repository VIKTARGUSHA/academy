package by.academy.Test8;

public class Port {
public int x = 1;

    public static void main(String[] args) {
        Store store = new Store();
        for (int j = 0; j < 5; j++) {

    Terminal3 terminal = new Terminal3(store);
    Thread terminal3 = new Thread(terminal);
    terminal3.start();

        }
    }
}
