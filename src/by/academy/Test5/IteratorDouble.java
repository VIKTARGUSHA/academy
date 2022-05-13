package by.academy.Test5;

import java.util.Iterator;

public class IteratorDouble<T> implements Iterator {

    int currentRow = 0;
    int currentColumn = 0;
    T[][] array;
    int quantityStrings = array.length;
    int quantityCoulumns = array[0].length;

    public IteratorDouble(T[][] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
return (quantityStrings < array.length && quantityCoulumns < array[0].length );
}

    @Override
    public T next() {
        if (currentRow < quantityStrings - 1) {
            if (currentColumn < quantityCoulumns - 1) {
                return array[currentRow][currentColumn++];
            } else if (currentColumn == quantityCoulumns - 1) {
                T lastInRow = array[currentRow++][currentColumn];
                currentColumn = 0;
                return lastInRow;
            }
        }
        else if (currentColumn < quantityCoulumns - 1) {
            return array[currentRow][currentColumn++];
        } else if (currentColumn == quantityCoulumns - 1) {
            T lastInRow = array[currentRow++][currentColumn];
            currentColumn = 0;
            return lastInRow;
        }
    }


    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
