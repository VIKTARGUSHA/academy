package by.academy.Test2;

import java.util.Scanner;

//Условие здачи: ввести 2 слова, состоящие из четного числа букв.
//Получить слово состоящее из первой половины первого слова и второй половины второго слова.
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String second = scanner.next();
        String subFirst = first.substring(0, first.length() / 2);
        String subSecond = second.substring(second.length()/2);
        String totalWord = subFirst + subSecond;
        System.out.println(totalWord);
        scanner.close();
    }
}