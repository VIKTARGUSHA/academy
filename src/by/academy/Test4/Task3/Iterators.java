package by.academy.Test4.Task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class Iterators<T> implements Iterator {

    T[] array;
    int indexIterator = 0;
    int lastElementVar = 1;

    public Iterators (T [] array){
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return indexIterator < array.length;
    }

    @Override
    public void remove() {

System.arraycopy(array, indexIterator, array, indexIterator-1, array.length-indexIterator);
array[array.length-lastElementVar] = null;
lastElementVar++;
indexIterator--;
     //   Iterator.super.remove();
    }

    @Override
    public T next() {
        return array[indexIterator++];
    }
}


