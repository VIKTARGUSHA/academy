package by.academy.Test7.Task1;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Task1  {
    public static void main(String[] args) {
        Random random = new Random();
        List <Long> list = random.longs(100, 0, 100)
                .map(o -> o = (long) (o * 3.14 - 20)).filter(o -> o < 100).boxed()
                .sorted(Comparator.comparing(o -> o)).toList();
        System.out.println(list.size() + " " + list.toString());
        Map<String, Long> map = list.stream().collect(Collectors.toMap(Object::toString, o -> o, (o, o1) -> o, TreeMap::new));
        System.out.println(map.size() + " " + map);
     }
}