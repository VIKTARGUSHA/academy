package by.academy.Test7;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Task1  {
    public static void main(String[] args) {

        Random random =new Random();
        List <Long> list = random.longs(100,0,100).limit(100).map(o -> o = (long) (o * 3.14 -20)).boxed().sorted(Long::compareTo).filter(o -> o < 100).skip(3).toList();
        System.out.println(list.toString());
        Map<String, Long> map = list.stream().collect(Collectors.toMap(Object::toString, o2 -> o2 , (o1,o2) -> o1, TreeMap::new));
        System.out.println(map.size() + " " + map.toString());
    }
}