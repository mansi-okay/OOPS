package Singleton_class;

public class Singleton {
    // private constructor prevents creating object outside class
    private Singleton(){
        System.out.println("Singleton object created!");
    }

    private static Singleton instance;

    // public method to provide access to the instance we created
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void log(String message){
        System.out.println(message);
    }
}
