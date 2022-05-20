package by.academy.Test7;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Task1  {
    public static void main(String[] args) {
        Random random = new Random();
        LongStream ls = random.longs(100);
        LongStream ls1 = LongStream.range(0, 100).limit(100).filter(o -> o < 90).peek(o -> o = (long)(o *  3.14 - 20));
        long [] ls2 = random.longs(100,0,100).toArray();
        Arrays.stream(ls2).limit(100).filter(o -> o < 90).peek(o -> o = (long)(o *  3.14 - 20)).sorted(new LongComparator());
       // random.longs(100,0,100).sorted(Comparator.comparing((Long o) -> o));
    }
}