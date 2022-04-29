package by.academy.Test1;

import java.util.Scanner;

//Ввести с консоли число от 1 до 10, вывести на экран таблицу умножения для этого числа.
//(10 чисел).
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = 1; i < 11; i++){
            System.out.print(x * i + " ");
        }
    }
}
