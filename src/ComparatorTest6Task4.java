import java.util.Comparator;

public class ComparatorTest6Task4 <File> implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    @Override
    public Comparator thenComparing(Comparator other) {
        return Comparator.super.thenComparing(other);
    }
}