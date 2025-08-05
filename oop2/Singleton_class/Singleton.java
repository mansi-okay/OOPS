package Singleton_class;

public class Singleton {
    // private constructor prevents creating object outside class
    private Singleton(){
        System.out.println("Singleton object created!");
    }

    //declaring ref variable of type Singleton
    private static Singleton instance;

    // public method to provide access to private ref variable instance we created
    public static Singleton getInstance(){
        if (Singleton.instance == null){
            Singleton.instance = new Singleton();
        }
        return Singleton.instance;
    }

    public void log(String message){
        System.out.println(message);
    }
}
