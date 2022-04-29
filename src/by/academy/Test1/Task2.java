package by.academy.Test1;

import java.util.Scanner;

//Используем switch/case. Ввести с консоли тип данных(созраняем в String) и переменную,
//        вывести на экран:
//        a) если тип данных int, вывести остаток от деления на 2
//        b) если double, вывести 70% от числа
//        c) если float, возвести в квадрат
//        d) если char, вывести код символа
//        e) String, вывести на экран строку в виде ("Hello " + переменная)
//        f) во всех остальных случаях вывести на экран ("Unsupported type");
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();
        String value = scanner.next();
        switch (type){
            case "int" :
                System.out.println(Integer.parseInt(value)%2);
                break;
            case "double" :
                System.out.println(Double.parseDouble(value)*0.7);
                break;
            case "float" :
                System.out.println(Math.pow(Float.parseFloat(value), 2));
                break;
            case "char" :
                System.out.println((int) value.charAt(0));
                break;
            case "String" :
                System.out.println("Hello " + value);
                break;
            default:
                System.out.println("Unsupported type");
        }
        scanner.close();
    }
}