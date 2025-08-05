package generics;

import java.util.Arrays;
import java.util.Objects;

public class CustomGenArrayList<T> {

    // Java uses type erasure for generics at runtime,
    // the JVM has no idea what T actually is. So it doesn't allow new T[].
    //private T[] data = new T[];


    //This works because Object[] can store any type
    //When retrieving, you cast back to T
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;


    public CustomGenArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T value){
        if (isFull()){
            resize();
        }
        data[size++] = value;
    }

    private boolean isFull(){
        return size == data.length;
    }

    private void resize(){
        Object[] temp = new Object[data.length * 2];

        for(int i = 0; i <data.length; i++){
            temp[i] = data[i];
        }

        data = temp;
    }

    public T remove(){
        //Typecasting required because without that, it will be like passing an Object type to T type
        T removed = (T)data[--size];
        return removed;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenArrayList<Integer> list = new CustomGenArrayList<>();
        for (int i = 0; i<14; i++){
            list.add(2*i);
        }

        System.out.println(list);
    }
}
