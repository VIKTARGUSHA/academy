package by.academy.Test2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String s1 = scanner.next();
        StringBuilder stringBuilder = new StringBuilder(s);
        StringBuilder stringBuilder1 = new StringBuilder(s1);
        if (s.length() != s1.length()) {
            System.out.println(false);
            return;
        }
        int breaker = 1;
        while (breaker > 0 && stringBuilder.length() != 0) {
          breaker = 0;
                for (int j = 0; j < stringBuilder.length(); j++) {
                    if (stringBuilder.charAt(0) == stringBuilder1.charAt(j)) {
                        stringBuilder.deleteCharAt(0);
                        stringBuilder1.deleteCharAt(j);
                        breaker++;
                       break;
                    }
                }
            }

        if (stringBuilder.length() == 0){
            System.out.println(true);
        } else System.out.println(false);
        scanner.close();
    }
}
