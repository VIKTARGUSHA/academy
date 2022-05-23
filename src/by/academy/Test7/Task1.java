package by.academy.Test7;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Task1  {
    public static void main(String[] args) {
        Random random = new Random();
        long [] ls2 = random.longs(100,0,100).toArray();
        LongStream lstream = LongStream.range(0,100);

        Map<String, Long> map1 = lstream.peek(o ->  o = (long)(o * 3.14 - 20))
                .skip(3).limit(100).filter(o -> o < 100).boxed().
                sorted(Comparator.comparing(o -> o)).collect(Collectors
                        .toMap(o1 -> o1.toString(), o2 -> o2));

        Map<String, Long> map = Arrays.stream(ls2).skip(3).limit(100).
                map(o -> o = (long)(o * 3.14 - 20)).boxed().filter(o -> o < 100).sorted((o1,o2) -> o1.compareTo(o2))
                .collect(Collectors.toMap( o1 -> o1.toString(),  o2 -> o2));// ,(o1,o2) -> o1 ));

        System.out.println(map1.size() + map1.toString() +  "\n" + map.size() + map.toString());
    }
}