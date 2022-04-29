package by.academy.Test1;

//Выводить на консоль степень двойки, пока результат не будет больше, чем 1_000_000.
public class Task4 {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        while (y < 1_000_000) {
            y = (int) Math.pow(2, x);
            if (y < 1_000_000) {
                System.out.println(y);
                x++;
            }
        }
    }
}