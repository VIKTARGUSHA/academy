package by.academy.Exam;


    import java.lang.reflect.Array;
import java.util.Arrays;

    public class Exam <T extends Number>{
        public T[] array;
        private int index = 0;
        T tt;
        public Exam(T [] array, T tt){
            this.array = array;
            this.tt = tt;
        }
        public void add(T t){
            if(index == array.length){
                T array1 [] =(T[]) Array.newInstance(tt.getClass(), array.length+1);

                System.arraycopy(array, 0, array1, 0, array.length);

                array = array1;
            }
            array[index++] = t;

        }
        public Double calaFinalMark(T[] arrays){
            Double total = 0.0;

            for (int i = 0; i < index; i++){
                total += arrays[i].doubleValue();
            }
            System.out.println(total);
            return total/(index);
        }

        @Override
        public String toString() {
            return "Exam{" +
                    "array=" + Arrays.toString(array) +
                    ", index=" + index +
                    '}';
        }
    }


