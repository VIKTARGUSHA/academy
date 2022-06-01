package by.academy.Test7.Task3;

import java.util.Scanner;

public class Calculator {
    int x;
    int y;
    public Calculator(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Calculator(){

    }

    public int subtract(int x, int y){
        return x - y;
    }

     public int add(int x, int y){
        return x + y;
     }

     public int multiply(int x, int y){
        return x * y;
     }

     public int divided(int x, int y){
        return x / y;
     }
}
