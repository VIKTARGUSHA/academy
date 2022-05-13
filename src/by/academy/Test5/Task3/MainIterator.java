package by.academy.Test5.Task3;

public class MainIterator {
    public static void main(String[] args) {
        Integer [][] array = new Integer[5][5];
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                array[i][j] = (int) (Math.random()*100);
            }
        }
        IteratorDouble iteratorDouble = new IteratorDouble(array);
        System.out.println(iteratorDouble.hasNext());
    }
}
