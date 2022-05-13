package by.academy.Test5;

//Задача 2.
//Можно писать все в main. Не нужно создавать новых классов.
//Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
//Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз.
//Замерьте время, которое потрачено на это.
//Сравните результаты и предположите, почему они именно такие.

import java.awt.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;

public class Task2<T> {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Task2 task2 = new Task2();
        task2.addElement(arrayList);
        System.out.println("ArrayList is filled");
        task2.addElement(linkedList);
        System.out.println("LinckedList is filled");
        task2.getElements(arrayList);
        System.out.println("Time Arraylist");
        task2.getElements(linkedList);
        System.out.println("Time LinckedList");
    }

    public AbstractList<T> addElement(AbstractList<T> abstractList) {

        for (int i = 0; i < 1000000; i++) {
            abstractList.add((T) new Object());
        }
        return abstractList;
    }

    public AbstractList<T> getElements(AbstractList<T> abstractList) {

        for (int j = 0; j < 100000; j++) {
            T some = abstractList.get((int) Math.random() * 100000);
        }
        return abstractList;
    }
}

