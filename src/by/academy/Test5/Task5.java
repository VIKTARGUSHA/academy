package by.academy.Test5;

//Задача 5.
//Можно писать все в main. Не нужно создавать новых классов.
//Имеется текст. Следует составить для него частотный словарь:
//Cоздать Map<Character, Integer> для символов, в который мы заносим символ и его количество.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task5 {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String text = "The sword takes after a ray of sun, but even it got stuck, cursed sprat in tomato";
        char[] charArray =text.toCharArray();
        Set<Character> set = new HashSet<>();
        int counter = 1;
        for (int i = 0; i < charArray.length; i++) {
            if (map.containsKey(charArray[i])) {
                map.put(charArray[i], map.get(charArray[i]) + 1);
            }
           else map.put(charArray[i], 1);
        }
        System.out.println(map.entrySet());
    }
}
