package by.academy.Test8;

public class MainPort {
    public static void main(String[] args) {
        TankerAdd tankerAdd = new TankerAdd();
        TankerSubtract tankerSubtract = new TankerSubtract();
        tankerAdd.start();
        tankerSubtract.start();
    }
}