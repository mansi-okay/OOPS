package generics;

import java.util.Arrays;
import java.util.List;

public class WildcardExample<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;


    public WildcardExample(){
        this.data = new Object[DEFAULT_SIZE];
    }


    //Can pass only Number type of list
    public void getList(List<Number> list){
    }

    //Can pass Number and its subclasses
    public void printList(List<? extends Number> list){
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

        WildcardExample<Integer> list = new WildcardExample<>();
        for (int i = 0; i<14; i++){
            list.add(2*i);
        }

        //Gives error as T should only be Number or its subclasses
        //WildcardExample<String> list1 = new WildcardExample<>();


        System.out.println(list);
    }
}
