package Singleton_class;

public class Main {
    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.log("First object.");
        obj2.log("Second object.");

        // all 2 ref variables are pointing to just one object
        System.out.println("Both variables pointing to same object: " + (obj1 == obj2));

    }
}
