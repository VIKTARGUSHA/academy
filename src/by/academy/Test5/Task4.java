package by.academy.Test5;

//Задача 4.
//Создать список оценок учеников с помощью ArrayList, заполнить случайными
//оценками. Найти самую высокую оценку с использованием итератора.

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(Math.random() * 10);
        }
        Iterator<Double> iterator = arrayList.iterator();
        double max = 0;
        while (iterator.hasNext()){
            Double d = iterator.next();
            System.out.printf("%.3f", d);
            System.out.print(" ");
            if(d > max){
                max = d;
            }
        }
        System.out.println();
        System.out.printf("%.1f", max);
    }
}