package by.academy.Test5.Task3;

import java.util.Iterator;

public class IteratorDouble<T> implements Iterator {

    int currentString = 0;
    int currentColumn = 0;
    T[][] array;
    int quantityStrings;
    int quantityCoulumns;

    public IteratorDouble(T[][] array) {
        this.array = array;
        quantityStrings = array.length;
        quantityCoulumns = array[0].length;
    }

    @Override
    public boolean hasNext() {
        return (currentString < quantityStrings && currentColumn < quantityCoulumns);
    }

    @Override
    public T next() {
        if (currentString < quantityStrings - 1) {
            if (currentColumn < quantityCoulumns - 1) {
                return array[currentString][currentColumn++];
            } else if (currentColumn == quantityCoulumns - 1) {
                T lastInRow = array[currentString++][currentColumn];
                currentColumn = 0;
                return lastInRow;
            }
        } else if (currentString == quantityStrings - 1) {
            if (currentColumn < quantityCoulumns - 1) {
                return array[currentString++][currentColumn++];
            } else if (currentColumn == quantityCoulumns - 1) {
                return array[currentString++][currentColumn++];
            }
        }
        return array[currentString][currentColumn];
    }

    @Override
    public void remove() {

        //  Iterator.super.remove();
    }
}
