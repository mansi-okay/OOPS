package Singleton_class;

public class Main {
    public static void main(String[] args) {

        //the first time getInstance() is called, a new Singleton object is created
        Singleton obj1 = Singleton.getInstance();

        //On subsequent calls, it just returns the same already created object since instance is no longer null
        Singleton obj2 = Singleton.getInstance();

        obj1.log("First object.");
        obj2.log("Second object.");

        // all 2 ref variables are pointing to just one object
        System.out.println("Both variables pointing to same object: " + (obj1 == obj2));

    }
}
