package cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age, String name){
        this.age = age;
        this.name = name;
        this.arr = new int[]{1,2,3,4,5};
    }

    @Override
    public Object clone() throws CloneNotSupportedException{

        //Perform shallow copy first
        Human clone = (Human) super.clone();

        //Deep copy of mutable field
        clone.arr = new int[this.arr.length];
        for (int i = 0; i< this.arr.length; i++){
            clone.arr[i] = this.arr[i];
        }
        return clone;
    }
}
