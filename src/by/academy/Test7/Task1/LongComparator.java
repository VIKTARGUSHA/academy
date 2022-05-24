package by.academy.Test7.Task1;

import java.util.Comparator;

public class LongComparator implements Comparator <Long> {

    @Override
    public int compare(Long o1, Long o2) {
        return o1.compareTo(o2);
    }
}
