package by.academy.Test5;
//Задача 1.
//Можно писать все в main. Не нужно создавать новых классов.
//Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.

import java.util.ArrayList;
import java.util.TreeSet;

public class Task1 <T> {

    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(2);
        Task1 task1 = new Task1();
        System.out.println(task1.getSet(arrayList));
    }

    public TreeSet <T> getSet(ArrayList <T> arrayList) {
        TreeSet<T> treeSet = new <T> TreeSet();
        treeSet.addAll(arrayList);
        return treeSet;
    }
}
