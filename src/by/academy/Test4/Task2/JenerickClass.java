package by.academy.Test4.Task2;

import java.lang.reflect.Array;
import java.util.Iterator;


public class  JenerickClass <T> {
    T [] array;
    T tt;
    public JenerickClass(){
        array =(T[]) Array.newInstance(tt.getClass(), 16);
    }
    public JenerickClass(int length, T tt){
        array =(T[]) Array.newInstance(tt.getClass(), length);
        this.tt = tt;
    }

    public T[] add (T object){
        for (int i = 0; i < array.length; i++){
            if (array[i] == null){
                array[i] = object;
                break;
            }
        }
        if (array[array.length-1] != null){
            T [] array1 = (T[]) Array.newInstance(tt.getClass(), array.length*2+1);
            System.arraycopy(array,0, array1, 0, array.length);
            array = array1;
        }
        return array;
    }
    public T get (int index){
        return array[index];
    }
    public T getLast(){
        return array[array.length-1];
    }
    public T getFirst(){
        return array[0];
    }
    public int showLength(){
        return array.length;
    }
    public T showLastFilled(){
        for (int j = 0; j < array.length; j++){
            if (array[j] == null){
                return array[j-1];
            }
        }
        return array[array.length-1];
    }

public T [] remove(int index){
        if(index < array.length) {
            System.arraycopy(array, index + 1, array, index, array.length - index - 1);
        }
        return array;
}
    public T [] remove(T object){
        for (int k = 0; k < array.length; k++) {
            if (object.equals(array[k])) {
                System.arraycopy(array, k + 1, array, k, array.length - k - 1);
            }
        }
        return array;
    }
}
