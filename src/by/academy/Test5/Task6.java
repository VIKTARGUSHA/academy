package by.academy.Test5;

public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[8];
        try {
            for (int i = 0; i < 10; i++) {
                array[i] = i;
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("Array is too small, expand the array");
        }
        System.out.println("Hello world");
    }
}