package by.academy.Test4.Task2;

import java.util.Arrays;

public class JenerickMain {
    public static void main(String[] args) {
        JenerickClass jenerickClass = new JenerickClass(8, "Hello");
        System.out.println(Arrays.toString(jenerickClass.array));
        jenerickClass.add("H");
        jenerickClass.add("e");
        jenerickClass.add("l");
        jenerickClass.add("l");
        jenerickClass.add("o");
        jenerickClass.add(" ");
        jenerickClass.add("W");
        jenerickClass.add("o");
        jenerickClass.add("r");
        jenerickClass.add("l");
        jenerickClass.add("d");
        jenerickClass.add("!");
        System.out.println(Arrays.toString(jenerickClass.array));

        System.out.println(jenerickClass.get(6));
        System.out.println(jenerickClass.getLast());
        System.out.println(jenerickClass.getFirst());
        System.out.println(jenerickClass.showLength());
        System.out.println(jenerickClass.showLastFilled());
        System.out.println(Arrays.toString(jenerickClass.remove(3)));
        System.out.println(Arrays.toString(jenerickClass.remove(3)));
        System.out.println(Arrays.toString(jenerickClass.remove("l")));
        System.out.println(Arrays.toString(jenerickClass.remove("l")));
        System.out.println(Arrays.toString(jenerickClass.remove("r")));
    }
}
