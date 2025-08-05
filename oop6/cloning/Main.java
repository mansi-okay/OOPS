package cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human someone = new Human(80, "Someone");

        Human copy = (Human) someone.clone();

        System.out.println(Arrays.toString(someone.arr));
        System.out.println(Arrays.toString(copy.arr));

        copy.arr[0] = 100;

        System.out.println(Arrays.toString(someone.arr));
        System.out.println(Arrays.toString(copy.arr));
    }
}
