package by.academy.Test4.Task3;

public class MainIterator {
    public static void main(String[] args) {
        String [] array = new String []{"H", "e", "l", "l", "o"," " , "W", "o", "r", "l", "d"};
        Iterators <String> iterators = new Iterators(array);
        System.out.println(iterators.hasNext());
        while (iterators.hasNext()){
            String s = iterators.next();
            System.out.print(s + " ");
            if(s.equals("l")){
                iterators.remove();
            }
        }
    }
}
