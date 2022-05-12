package by.academy.Test4.Task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class Iterators<T> implements Iterator{
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
    ArrayList

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void forEachRemaining(Consumer action) {
        Iterator.super.forEachRemaining(action);
    }
//private T[] array;
//int counter = 0;
//public Iterators(T [] array){
//    this.array = array;
//}
//public boolean hasNext(){
//    counter++;
//    return counter < array.length-1;
//}
//public T next() {
//    if (hasNext()) {
//
//    }
//    counter++;
//    return array[counter];
//}
//Iterator
}
