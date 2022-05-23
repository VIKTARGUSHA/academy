package by.academy.Test7;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        long[] arLong = random.longs(100, 0, 100).limit(100).sorted().toArray();
       // Map<String, Long> map = Arrays.stream(arLong).collect(Collectors.toMap((Long o1) -> o1.toString(),o1 -> o1));
        LongStream ls = LongStream.range(0,100);
        List<Long> list = ls.map(o -> Long.valueOf(o)).collect(Collectors.toList());
        Stream ls = (Stream) LongStream.range(0,100).
        limit(100).skip(3).filter(o -> (long)o < 80).peek(o -> o =(long) (o * 3.14 - 20) )
                .sorted((Long o1, Long o2) -> {return o1.compareTo(o2);}     //.sorted(new ComparatorLong())////.sorted(Comparator.comparing(o1 ->(long) o1))
                .collect(Collectors.toMap(String::valueOf, (Long o1) -> o1 ));
Stream<Long> sL = Arrays.stream(arLong).sorted((Long o1,Long o2) -> o1.compareTo(o2));
    }
}